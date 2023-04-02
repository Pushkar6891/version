package com.company;
import java.util.Scanner;

public class ClientTester4Boolean {

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter first boolean Value:");
			boolean a = scanner.nextBoolean();
			System.out.println("Enter second boolean Value:");
			boolean b = scanner.nextBoolean();
			
			int hashCode1 = Boolean.hashCode(a);
			int hashCode2 = Boolean.hashCode(b);
			System.out.println(hashCode1);
			System.out.println(hashCode2);
			
			boolean logicalAnd = Boolean.logicalAnd(a, b);
			System.out.println(logicalAnd);
			boolean logicalOr = Boolean.logicalOr(a, b);
			System.out.println(logicalOr);
			boolean logicalXor = Boolean.logicalXor(a, b);
			System.out.println(logicalXor);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}