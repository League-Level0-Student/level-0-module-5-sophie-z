package nested_loops;

public class ForLoopGauntlet {
public static void main(String[] args) {
	for(int i=0; i<101; i++) {
		System.out.println(i);
	}
	for(int x=100; x>=0; x--) {
		System.out.println(x);
	}
	for(int y=2; y<101; y+=2) {
		System.out.println(y);
	}
	for(int z=1; z<100; z+=2) {
		System.out.println(z);
	}
	for(int j=1; j<500; j++) {
		if(j%2==0) {
		System.out.println(j + " is even");
		}
		else {
		System.out.println(j + " is odd");
		}
		}
	for(int m=7; m<778; m+=7) {
		System.out.println(m);
	}
	for(int s=2008; s<2020; s++) {
			System.out.println("In " + s + ", I was " + (s-2008) + " years old.");
	}
	for(int a=0; a<3; a++) {
		for(int u=0; u<3; u++) {
			System.out.println(a + " " + u);
		}
		}
	for(int w=0; w<=6; w+=3) {
		for(int e=1; e<4; e++) {
			System.out.print(e + w);
			}
		System.out.println();
	}
	for(int p=0; p<41; p+=10) {
	for(int k=-1; k<31; k+=10) {
	for(int h=0; h<21; h+=10) {
	for(int g=1; g<11; g++) {
		System.out.print(g + h + k + p);
	}
	System.out.println();
	}
	}
	}
}
}