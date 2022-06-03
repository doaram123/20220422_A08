using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy220603_02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("숫자 입력");
            int num = int.Parse(Console.ReadLine());
            //num을 2로 나눴을 때 나머지가 0이 아닌 경우(=홀수)에만 "홀수" 출력
            if (num % 2 != 0)
            {
                Console.WriteLine("홀수");
                Console.WriteLine(num);
            }

            //삼항연산자
            //엑셀의 if문과 유사, 1줄로 조건문을 표시하는 간단한 코드
            //보통 2가지 경우의 수가 있을 때 사용
            //물음표(?) 뒤에 있는 것은 조건이 참일 때 성립, 거짓이면 콜론(:) 뒤에 있는 것이 성립

            string result = num % 2 == 0 ? "짝" : "홀";
            Console.WriteLine("결과:" + result);

            switch (num % 2)
            {
                case 0:
                    Console.WriteLine("num은 짝");
                    break;
                case 1:
                    Console.WriteLine("num은 홀");
                    break;
                default:
                    break;
            }

            Console.WriteLine("안녕하세요".Contains("안녕"));
            Console.WriteLine("안녕하세요".Equals("안녕하세요"));
            Console.WriteLine("안녕하세요"=="안녕하세요");

            Console.WriteLine("년도 입력 : ");
            int year = int.Parse(Console.ReadLine());
            if(year%12 ==0)
            {
                Console.WriteLine("원숭이띠");
            }
            else if(year%12 ==1)
            {
                Console.WriteLine("닭띠");
            }
            else if(year %12 ==2)
            {
                Console.WriteLine("개띠");
            }
            else if( year %12 ==3)
            {
                Console.WriteLine("돼지띠");
            }
            else if(year%12==4)
            {
                Console.WriteLine("쥐띠");
            }
            else if(year%12==5)
            {
                Console.WriteLine("소띠");
            }
            else if(year%12==6)
            {
                Console.WriteLine("호랑이띠");
            }
            else if (year % 12 == 7)
            {
                Console.WriteLine("토끼띠");
            }
            else if (year % 12 == 8)
            {
                Console.WriteLine("용띠");
            }
            else if (year % 12 == 9)
            {
                Console.WriteLine("뱀띠");
            }
            else if (year % 12 == 10)
            {
                Console.WriteLine("말띠");
            }
            else
            {
                Console.WriteLine("양띠");
            }

            switch (DateTime.Now.Year%12)
            {
                case 0:
                    Console.WriteLine("원숭이띠");
                    break;

                case 1:
                    Console.WriteLine("닭띠");
                    break;

                case 2:
                    Console.WriteLine("개띠");
                    break;

                case 3:
                    Console.WriteLine("돼지띠");
                    break;

                case 4:
                    Console.WriteLine("쥐띠");
                    break;

                case 5:
                    Console.WriteLine("소띠");
                    break;

                case 6:
                    Console.WriteLine("호랑이띠");
                    break;

                case 7:
                    Console.WriteLine("토끼띠");
                    break;

                case 8:
                    Console.WriteLine("용띠");
                    break;

                case 9:
                    Console.WriteLine("뱀띠");
                    break;

                case 10:
                    Console.WriteLine("말띠");
                    break;

                case 11:
                    Console.WriteLine("양띠");
                    break;
                default:
                    break;
            }

            Console.WriteLine("월 입력 : ");
            int month=int.Parse(Console.ReadLine());
            if(month == 12 || month < 3)
            {
                Console.WriteLine("겨울");
            }
            else if (month < 6)
            {
                Console.WriteLine("봄");
            }
            else if(month < 9)
            {
                Console.WriteLine("여름");
            }
            else if(month<12)
            {
                Console.WriteLine("가을");
            }

            switch (DateTime.Now.Month+1)
            {
                case 1:
                    Console.WriteLine("겨울");
                    break;
                case 2:
                    Console.WriteLine("겨울");
                    break;
                case 3:
                    Console.WriteLine("봄");
                    break;
                case 4:
                    Console.WriteLine("봄");
                    break;
                case 5:
                    Console.WriteLine("봄");
                    break;
                case 6:
                    Console.WriteLine("여름");
                    break;
                case 7:
                    Console.WriteLine("여름");
                    break;
                case 8:
                    Console.WriteLine("여름");
                    break;
                case 9:
                    Console.WriteLine("가을");
                    break;
                case 10:
                    Console.WriteLine("가을");
                    break;
                case 11:
                    Console.WriteLine("가을");
                    break;
                case 12:
                    Console.WriteLine("겨울");
                    break;
                default:
                    break;
            }

        }
    }
}
