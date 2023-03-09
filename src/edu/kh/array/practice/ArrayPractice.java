package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void ap1() {
		// 길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
		// 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후 
		// 짝수 번째 인덱스 값의 합을 출력하세요 (0번째 인덱스는 짝수로 취급)
		
		/* [실행 화면]
		 * 
		 * 
		 * 1 2 3 4 5 6 7 8 9 
		 * 짝수 번째 인덱스 합 : 25
		 * */
		int[] arr = new int[9];
			
		int sum = 0;
	
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
			
			System.out.print(arr[i] + " ");
		
			if(i % 2 ==0) {
				sum += arr[i];
				
			}
		}	
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	}
	public void ap2() {
		// 길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
		// 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후 
		// 홀수 번째 인덱스 값의 합을 출력하세요 (0번째 인덱스는 짝수로 취급)
		
		/* [실행 화면]
		 * 
		 * 
		 * 9 8 7 6 5 4 3 2 1 
		 * 홀수 번째 인덱스 합 : 20
		 * */
		int[] arr = new int[9];
		
		int sum = 0;
	
		
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = 9 - i;
			
			System.out.print(arr[i] + " ");
			
			if(i % 2 != 0) {
				sum += arr[i];
			}
		}
		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
	}	
	public void ap3() {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요 
		
		/* [실행화면]
		 * 
		 * 양의 정수 : 5
		 * 1 2 3 4 5
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i <arr.length; i++) {
			arr[i] = i + 1;
			
			System.out.print(arr[i] + " ");
		} 
	}
	public void ap4() {
		// 정수 5개를 입력 받아 배열을 초기화 하고
		// 검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력
		// 배열에 같은 수가 없을 경우 "일치하는 값이 존재하지 않습니다" 출력

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i = 0; i <arr.length; i++) {
			System.out.print("입력" + i + ":");
			arr[i] = sc.nextInt();
			
		}

		System.out.print("검색할 값 : ");
		
		int search = sc.nextInt();
		
		boolean flag = false;
				
		for(int i=0; i < arr.length; i++) {
			if(arr[i] == search) {
				System.out.print("인덱스 : " + i);
				
				flag = true;

		    }
	    }

		if(flag == false) {
		System.out.println("일치하는 값이 존재하지않습니다.");
		}
	}	
	public void ap5() {
		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고 
		// 검색 할 문자가 문자열에 몇개가 들어가 있는지
		// 개수와 몇번째 인덱스에 위치하는지 인덱스를 출력하세요 
		
		/* [실행화면]
		 * 문자열 : application
		 * 문자 : i
		 * application에 i가 존재하는 위치(인덱스) : 4 8
		 * i 개수 : 2
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();

		System.out.print("문자 : ");
		char ch = sc.next().charAt(0); // 입력 받은 문자열에서 0번째 인덱스 문자를 반환 
		// String -> char
		
		char[] arr = new char[input.length()]; // 입력 받은 문자열 길이 만큼의 배열 생성
		
		int count = 0; // input에 일치하는 ch가 몇개 있는지 카운트 변수
		
		System.out.println(input + "에" + ch + "가 존재하는 위치(인덱스) : ");
		
		for(int i = 0; i <arr.length; i++) {
			
			// 배열 대입
			arr[i] = input.charAt(i); // 입력 받은 문자열에서 i번째 인덱스 문자를 arr[i]에 대입 
			
			// 검색
			if(arr[i] == ch) { // 검색 조건 char는 기본형이기 때문에 비교 연산 가능 	
				System.out.print(i + " ");
				count++;

			}
	
		}
		
		System.out.println("\n개수: " + count);

	}
	public void ap6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		int sum = 0;
		String value = " ";
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열" + i + "번째" + "인덱스에 넣을 값: ");
			arr[i] = sc.nextInt();
			sum += arr[i];
			value += arr[i] + " ";
		}
		System.out.println(value);
		System.out.println("총 합 : " + sum);
		}
	public void ap7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		char[] arr = sc.nextLine().toCharArray();
	
		
		for(int i=0; i<arr.length; i++) {
			if(i>=8) {
				arr[i] = '*';
				
			}
			
			System.out.print(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		
	
	}
	public void ap8() {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 : ");
			int input = sc.nextInt();

			if(input >= 3 && input%2 == 1) {
				int[] arr = new int[input];
				int x = 1; // 1부터 나오게할거니까 1로 초기화
				for(int i=0; i<arr.length;i++) {
					arr[i] = x;
					
					if(i<arr.length/2) {
						x++;
					}else {
						x--;
					}
				}
				//배열의 각 인덱스에 담긴 값 출력 
				for(int i=0;i<arr.length;i++) {
					if(i<arr.length-1) {
						System.out.print(arr[i]+ ", "); 
					}else {
						System.out.print(arr[i]); 
					}
				}
					break;
					
				} else {
					System.out.println("다시 입력하세요.");
				}
		 }
	}	
	
	public void ap9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		if(input < 3 && input%2 != 0) {
			for(int i=1; i<=arr.length; i++) {
				arr[i] = Arrays.copyOf(arr, arr.length/2);
				
			}
		
		}
		
				
				
				System.out.println(Arrays.toString(arr));
			
		
		


	}


}	