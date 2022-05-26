CREATE TABLE membertbl (
    membernumber INTEGER NOT NULL,
    membername   NVARCHAR2(10) NOT NULL,
    birthday     INTEGER,
    memberemail  VARCHAR2(30),
    mobile1      INTEGER NOT NULL,
    mobile2      INTEGER NOT NULL
);

delete from membertbl;

alter table membertbl
    modify (mobile1 CHAR(3));
    
alter table membertbl
    modify (mobile2 CHAR(8));

CREATE TABLE seattbl (
    carnumber INTEGER NOT NULL,
    seat1     INTEGER NOT NULL,
    seat2     INTEGER,
    seat3     INTEGER,
    seat4     INTEGER
);

CREATE TABLE paytbl (
    membernumber INTEGER NOT NULL,
    bankname     VARCHAR2(6) NOT NULL,
    cardnumber   INTEGER NOT NULL,
    validity     DATE NOT NULL,
    password     INTEGER NOT NULL
);
delete from paytbl;

alter table paytbl
    modify (validity char(40));

alter session set NLS_DATE_FORMAT = 'YYYY/MM/DD';
    
alter table paytbl
    modify (bankname varchar2(20));
    

CREATE TABLE reservetbl (
    membernumber  INTEGER,
    tdate         DATE NOT NULL,
    person        INTEGER default 1 NOT NULL
);

delete from reservetbl;

alter table reservetbl
    modify (trainname char(20));

alter table reservetbl
    add (trainname char(20), trainnumber integer, startstation nvarchar2(10), finishstation nvarchar2(10), starttime char(5), finishtime char(5));
        
select * from reservetbl;

CREATE TABLE traintbl (
    trainname     CHAR(10),
    trainnumber   INTEGER NOT NULL,
    startstation  NVARCHAR2(10) NOT NULL,
    finishstation NVARCHAR2(10) NOT NULL,
    starttime     CHAR(5) NOT NULL,
    finishtime    CHAR(5) NOT NULL,
    price         INTEGER NOT NULL
);

alter table traintbl
    modify (trainname nvarchar2(20));

alter table traintbl
    rename column price to price1;
    
alter table traintbl
    add price2 integer;
    
alter table seattbl
    add class nvarchar2(5) not null;
    
alter table seattbl
    modify (seat1 varchar2(5));
    
alter table seattbl
    modify (seat2 varchar2(5));
    
alter table seattbl
    modify (seat3 varchar2(5));
    
alter table seattbl
    modify (seat4 varchar2(5));
    
alter table seattbl
    add (membernumber integer);
    
ALTER TABLE membertbl ADD CONSTRAINT membertbl_pk PRIMARY KEY ( membernumber );
ALTER TABLE paytbl ADD CONSTRAINT paytbl_pk PRIMARY KEY ( membernumber );
ALTER TABLE reservetbl ADD CONSTRAINT reservetbl_pk PRIMARY KEY ( membernumber );
ALTER TABLE seattbl ADD CONSTRAINT seattbl_pk PRIMARY KEY ( membernumber );

ALTER TABLE paytbl
    ADD CONSTRAINT paytbl_membertbl_fk 
    FOREIGN KEY ( membernumber )
    REFERENCES membertbl ( membernumber );

ALTER TABLE reservetbl
    ADD CONSTRAINT reservetbl_membertbl_fk 
    FOREIGN KEY ( membernumber )
    REFERENCES membertbl ( membernumber );
    
ALTER TABLE seattbl
    ADD CONSTRAINT seattbl_membertbl_fk
    FOREIGN KEY ( membernumber )
    REFERENCES membertbl ( membernumber );

insert into membertbl values(123456, '���ƶ�', 19990106, 'doaram123@naver.com', 010, 12345678);
insert into membertbl values(456789, '�̽±�', 19791125, 'leeseunggy@naver.com', 010, 11111111);
insert into membertbl values(198473, '�����', 19870324, 'kimbumsu@naver.com', 010, 22222222);
insert into membertbl values(254841, '���ȣ', 19710525, 'kimgeongho@naver.com', 010, 33333333);
insert into membertbl values(844715, '���ð�', 19830428, 'sungsigeong@naver.com', 010, 44444444);


select membernumber "ȸ����ȣ", membername "�̸�", membertbl.birthday "�������", membertbl.memberemail "�̸���", mobile1||mobile2 "��ȭ��ȣ"
from membertbl;

insert into traintbl values('KTX', 045, '���￪', '���뱸��', '16:00', '17:51', 60300, 43100);
insert into traintbl values('SRT', 324, '�λ꿪', '�Ű��ֿ�', '10:15', '10:42', 10100, '');
insert into traintbl values('����ȭȣ', 1207, '������', '��꿪', '08:34', '12:11', 19300, '');
insert into traintbl values('ITX-������', 1032, '������', '���￪', '12:44', '14:29', 16000, '');
insert into traintbl values('����ȭȣ', 1779, '���뱸��', '��ȭ����', '17:08', '18:31', 7700, '');
insert into traintbl values('KTX', 432, '���ּ�����', '������', '19:29', '19:46', 13200, 8400);
insert into traintbl values('KTX', 207, 'õ�Ⱦƻ꿪', '�о翪', '09:45', '11:30', 46800, 33400);
insert into traintbl values('SRT', 334, '���뱸��', '������', '15:44', '17:13', 36400, '');
insert into traintbl values('����ȭȣ', 1362, '�λ꿪', '���̿�', '21:17', '23:21', 10700, '');
insert into traintbl values('KTX-����', 841, '���￪', '��������', '07:01', '09:12', 34000, 28300);

select * from traintbl;

select trainname "�����̸�", trainnumber "������ȣ", startstation "��߿�", finishstation "������", starttime "��߽ð�", finishtime "�����ð�", price1 "Ư�ǰ���", price2 "�Ϲݽǰ���"
from traintbl;

insert into paytbl values(123456, '����',1234567891234254, '06/22', 1234);
insert into paytbl values(456789, '����',1547895412357895, '12/25', 4567);
insert into paytbl values(198473, '����',7151784521482354, '03/24', 5748);
insert into paytbl values(254841, 'īī��',5474521457893551, '05/24', 8441);
insert into paytbl values(844715, '�뱸',4512486217651268, '07/22', 9541);

select * from paytbl;

select membernumber "ȸ����ȣ", bankname "����", cardnumber "ī���ȣ", validity "��ȿ�Ⱓ", password "��й�ȣ"
from paytbl;

insert into reservetbl values(123456, '2022-09-22', 1, 'KTX', 045, '���￪', '���뱸��', '16:00', '17:51');
insert into reservetbl values(456789, '2022-05-25', 2, 'KTX-����', 841, '���￪', '��������', '07:01', '09:12');
insert into reservetbl values(198473, '2022-07-13', 1, '����ȭȣ', 1779, '���뱸��', '��ȭ����', '17:08', '18:31');
insert into reservetbl values(254841, '2022-06-01', 3, 'SRT', 324, '�λ꿪', '�Ű��ֿ�', '10:15', '10:42');
insert into reservetbl values(844715, '2022-06-17', 4, 'KTX', 207, 'õ�Ⱦƻ꿪', '�о翪', '09:45', '11:30');

select * from reservetbl;

select * from seattbl;

insert into seattbl values(045, '15C','','','','�Ϲݽ�',123456);
insert into seattbl values(841, '24A','25B','','','Ư��',456789);
insert into seattbl values(1779, '08D','','','','�Ϲݽ�',198473);
insert into seattbl values(324, '42A','43B','44C','','�Ϲݽ�',254841);
insert into seattbl values(207, '30A','31B','32C','33D','Ư��',844715);

select m.membernumber as "ȸ����ȣ", r.trainname as "�����̸�", r.trainnumber as "������ȣ", s.class as "����", r.startstation as "��߿�", r.finishstation as "������", r.starttime as "��߽ð�", r.finishtime as "�����ð�", r.person as "�ο�", s.seat1 || s.seat2 || s.seat3 || s.seat4 as "�¼�"
from membertbl m
inner join reservetbl r
    on m.membernumber=r.membernumber
inner join seattbl s
    on r.membernumber=s.membernumber;
    
select * from membertbl;
select * from traintbl;
select * from reservetbl;
