using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudy220603_03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int year=int.Parse(Console.ReadLine());
            int year_thee = year % 12;
            
            if(year_thee == 0)
                Console.WriteLine("원숭이");
            else if(year_thee == 1)
                Console.WriteLine("닭");
            else if(year_thee==2)
                Console.WriteLine("개");
            else if(year_thee==3)
                Console.WriteLine("돼지");
            else if (year_thee == 4)
                Console.WriteLine("쥐");
            else if (year_thee == 5)
                Console.WriteLine("소");
            else if (year_thee == 6)
                Console.WriteLine("호랑이(범)");
            else if (year_thee == 7)
                Console.WriteLine("토끼");
            else if (year_thee == 8)
                Console.WriteLine("용");
            else if (year_thee == 9)
                Console.WriteLine("뱀");
            else if (year_thee == 10)
                Console.WriteLine("말");
            else if (year_thee == 11)
                Console.WriteLine("양");

            year = DateTime.Now.Year;
            year_thee = year % 12;
            switch (year_thee)
            {
                case 0:
                    Console.WriteLine("원숭이");
                    break;
                case 1:
                    Console.WriteLine("닭");
                    break;
                case 2:
                    Console.WriteLine("개");
                    break;
                case 3:
                    Console.WriteLine("돼지");
                    break;
                case 4:
                    Console.WriteLine("쥐");
                    break;
                case 5:
                    Console.WriteLine("소");
                    break;
                case 6:
                    Console.WriteLine("호랑이");
                    break;
                case 7:
                    Console.WriteLine("토끼");
                    break;
                case 8:
                    Console.WriteLine("용");
                    break;
                case 9:
                    Console.WriteLine("뱀");
                    break;
                case 10:
                    Console.WriteLine("말");
                    break;
                case 11:
                    Console.WriteLine("양");
                    break;
      
                default:
                    break;
            }

            Console.WriteLine("몇 월에 태어나셨나요?");
            int month = int.Parse(Console.ReadLine());
            if (month == 12 || month == 1 || month == 2)
            {
                Console.WriteLine("겨울");
            }
            else if (month >= 3 && month <= 5)
                Console.WriteLine("봄");
            else if (month >= 6 && month <= 8)
                Console.WriteLine("여름");
            else if (month >= 8 && month <= 12)
                Console.WriteLine("가을");
            else
                Console.WriteLine("잘못된 month입니다." + month) ;

            month = DateTime.Now.Month;
            switch (month)
            {
                case 12:
                case 1:
                case 2:
                    Console.WriteLine("겨울입니다.");
                    break;
                case 3:
                case 4:
                case 5:
                    Console.WriteLine("봄입니다.");
                    break;
                case 6:
                case 7:
                case 8:
                    Console.WriteLine("여름입니다.");
                    break;
                case 9:
                case 10:
                case 11:
                    Console.WriteLine("가을입니다.");
                    break;
                default:
                    break;
            }
        }
    }
}
