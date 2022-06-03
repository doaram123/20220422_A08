using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpStudyHW220603
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //문제1
            int num1 = int.Parse(Console.ReadLine());
            int num2 = int.Parse(Console.ReadLine());
            int num3 = int.Parse(Console.ReadLine());
            int num4 = int.Parse(Console.ReadLine());
            int num5 = int.Parse(Console.ReadLine());
            int[] mynum = { num1, num2, num3, num4, num5 };
            Console.WriteLine("최댓값 : " + mynum.Max());
            Console.WriteLine("최솟값 : " + mynum.Min());

            //문제2
            for (char a = 'A'; a <= 'Z'; a++)
                Console.Write(a);
            Console.WriteLine();
            for (char b = 'a'; b <= 'z'; b++)
                Console.Write(b);
            Console.WriteLine();

            //문제3
            int tri = int.Parse(Console.ReadLine());
            for (int i = 0; i < tri; i++)
            {
                for (int j = 0; j < 1+i; j++)
                {
                    Console.Write("*");
                }
                Console.WriteLine();
            }

            //문제4
            int sta = int.Parse(Console.ReadLine());
            for(int c=0; c<sta; c++)
            {
                for(int d=0;d<sta-c;d++)
                {
                    Console.Write(" ");
                }
                for(int e=0;e<c+1;e++)
                {
                    Console.Write("*");
                }
                Console.WriteLine();
            }

            //문제5
            int tree=int.Parse(Console.ReadLine());
            for(int f=0;f<tree; f++)
            {
                for(int g=0;g<(tree-f-1);g++)
                {
                    Console.Write(" ");
                }
                for(int h=0;h<f;h++)
                {
                    Console.Write("*");
                }
                for(int k=0;k<=f;k++)
                {
                    Console.Write("*");
                }
                Console.WriteLine();
            }

            //문제6
            int[] arr = { 4, 34, 78, 100, 10, 25, 82 };
            int temp;
            for (int i = 0; i < arr.Length; i++)
            {
                int low = i;

                for(int j = i+1; j < arr.Length; j++)
                {
                    if (arr[j] < arr[low])
                        low = j;
                }
                temp = arr[low];
                arr[low] = arr[i];
                arr[i] = temp;
            }
            for(int k=0;k<arr.Length;k++)
            {
                if(k<arr.Length-1)
                {
                    Console.Write(arr[k]+", ");
                }
                else
                {
                    Console.Write(arr[k]+", ");
                }
            }
            Console.WriteLine();

            //문제7

        }
    }
}
