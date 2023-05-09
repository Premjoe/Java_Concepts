package com.Data_Types;

public class Primitive_Data_Types {

	public static void main(String[] args) {
		// Java is the strict data type

		// 1. Primitive data types: It will just take some space in the memory and no
		// need to take any object class
		// It's 2 type : 1. Numeric 2. Boolean
		// Numeric - 1.
		// Integer: a.Byte, short, int, long
		// Floating point: b. Float, Double
		// Char : char
		// Boolean : True, False

		// 2. Non Primitive Data types : String, Interface, Arrays, Abstract class

		// 1.byte :
		// size : 1 byte = 8 bits
		// Range : -128 to 127

		byte b = 10;
		byte b1 = 20;
		b = 40;
		System.out.println(b);
		// byte v = 130;

		// Use case : Age, no of months, no of days, no week.

		// 2. short :
		// Range : -32768 to 32767
		// size: 2 bytes = 2x8 = 16 bits

		short s = 1000;
		short s1 = 25000;

		// 3. int:
		// Range
		// size :4bytes = 4x8 = 32 bits
		int i = 10000;
		int k = -9876;

		// 4.long:
		// Size : 8 bytes = 8x8 = 64 bits

		long l1 = 1234566789;
		long l2 = 1093839438494L;
		System.out.println(l2);

		// Use case : World population, total no of year, covid case,

		// Acc number, adhar number, phoenumber , creadit card - we can use for string

		// 5.float :
		// Size : 4 bytes = 4x8 = 32 bits
		// Range : can take up to 6 to 7 digits

		float h = 12.3f;
		// use case : build version,

		// 6.double :
		// Size : 8 bytes = 8x8 = 64 bits
		double d = 12.3333;

		// 7.char:
		// Range : -32768 to 32767
		// size: 2 bytes = 2x8 = 16 bits
		// uni code chars : ASCII + Special uni code chars
		char c1 = 'a';
		char c2 = 'A';
		char c3 = '1';
		char c4 = '$';

		System.out.println(c1);
		System.out.println((int) c1);
		System.out.println((int) c4);
		System.out.println((byte) c2 + " this is byte coversation");
		System.out.println((byte) ' '); // space also consider char
		System.out.println(c1 + " " + c2);

	}

}
