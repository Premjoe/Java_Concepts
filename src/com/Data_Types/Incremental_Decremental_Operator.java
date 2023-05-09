package com.Data_Types;

public class Incremental_Decremental_Operator {

	public static void main(String[] args) {
		// ++ / --

		// 1. post increment: ++ : first assign then increase
		int a = 1;
		int b = a++;
		// a = 1; The original value immediately given in to b, now b = 1,
		// then it will increment the 1 value with a++ , a = 2

		System.out.println(a);// 2
		System.out.println(b);// 1
		System.out.println("------");

		int c = 10;
		int d = c++;
		System.out.println(c);// 11
		System.out.println(d);// 10

		System.out.println("------");

		int f = -99;
		int g = f++;
		System.out.println(f);// -98
		System.out.println(g);// -99
		// g = -99, f = -99 +1 = -98

		System.out.println("------");

		// 2. pre increment: first increase the value and then assign
		int x = 1;
		int y = ++x;
		System.out.println(x);
		System.out.println(y);
		// x = 1, x++ = 2, x=2, The increased value will be passed to y
		// y = 2

		System.out.println("------");

		int t1 = -999;
		int t2 = ++t1;
		System.out.println(t1);// -998
		System.out.println(t2);// -998
		// t1= -999, Immediately it will increment with 1, t1= -999 + +1 = -998 now t1 =
		// -998
		// The -998 value will be pass to t2, t2 = -998

		System.out.println("------");

		double d1 = 1.1;
		double d2 = d1++;
		System.out.println(d1);// 2.1
		System.out.println(d2);// 1.1

		char c1 = 'a';// 97
		char c2 = ++c1;
		System.out.println(c1);// 98->b
		System.out.println(c2);// 98->b

		// 3. post decrement: --
		int p = 2;
		int q = p--;
		System.out.println(p);// 1
		System.out.println(q);// 2

		int u1 = 10;
		int u2 = u1--;
		System.out.println(u1);// 9
		System.out.println(u2);// 10

		int p1 = -99;
		int p2 = p1--;
		System.out.println(p1);// -99-1 = -100
		System.out.println(p2);// -99

		// 4. pre decrement: --
		int h1 = 2;
		int h2 = --h1;
		System.out.println(h1);// 1
		System.out.println(h2);// 1

		int v1 = -96;
		int v2 = --v1;
		System.out.println(v1);// -97
		System.out.println(v2);// -97

		System.out.println("------");

		int test = 5;
		System.out.println(test++); // 5
		// Here first - Immediately println is consume the original value but in memory
		// it will be test = 6
		System.out.println(test);// 6

		System.out.println("------");

		int pop = 8;
		System.out.println(++pop);
		// Here first - Increase with original value then it will print, also in memory
		// it will be pop = 9
		System.out.println(pop);

		System.out.println("------");

		char ch = '0';// 48
		System.out.println(++ch);// 48+1 = 49 --> '1'

		System.out.println("------");

		char ch1 = '$';
		System.out.println(++ch1);

		System.out.println("------");

		char ch2 = 'a';
		System.out.println(ch2++);// a (97)
		System.out.println((byte) ch2);// b (98)

//				boolean flag = true;
//				System.out.println(flag++);

//				String s = "hello";
//				System.out.println(s++);
		System.out.println("------");

		int e1 = 2;
		int e2 = e1++ + ++e1; //
		System.out.println(e1);// 4
		System.out.println(e2);// 6

		System.out.println("------");

		int l1 = 2;
		int l2 = l1++ - l1++ + l1--;
		System.out.println(l1);
		System.out.println(l2);

		System.out.println("------");

		int s1 = 1;
		int s2 = 2;

		System.out.println(--s2 - ++s1 + ++s2 - --s1);
		System.out.println(s1);
		System.out.println(s2);

		System.out.println("------");
		//
		int i = 19, j = 29, k;
		k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
		// k = 19-18+28-29+18-29+19-28=-20
		System.out.println("i=" + i);// 19
		System.out.println("j=" + j);// 29
		System.out.println("k=" + k);// -20

		int sos = 10;
//				int dos = sos+1;
//				int dos1 = sos++;
//				int dos2 = ++sos;
		sos += 2;
		sos = sos + 2;
		System.out.println(sos);

		//
		int m = 0, n = 0;
		int ppp = --m * --n * n-- * m--;
		// = -1
		System.out.println(ppp);
		System.out.println(m);
		System.out.println(n);

		int xx = 111;
		int cx = 120;
		short res = (short) (xx + cx);
		System.out.println(res);

	}

}
