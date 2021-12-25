/**
 * @(#)BaiTapTongHop.java
 *
 *
 * @author Phan Duc Tri
 * @version 1.00 2021/4/13
 */
import java.util.Scanner;
import java.util.GregorianCalendar;

public class BaiTapTongHop {
        
    /**
     * 
     */
    public BaiTapTongHop() {
    }
    
    /**
     * @
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bai07.run();
        Bai01.run();
        Bai02 b2 = new Bai02();
        b2.run();
        Bai03.run();
        Circle.excute();
    }
}

class Bai01{
	public static void run(){
		Scanner input = new Scanner(System.in);		// Tao moi doi tuong Scanner
		int number;
		// Thong bao nguoi dung nhap mot so nguyen tu 0 - 1000.
		System.out.print("Nhap mot so nguyen giua 0 va 1000: ");
		
		do{
			 number = input.nextInt();
			 if(number<=0||number>=1000){
			 	System.out.println("Sai roi nhap lai");
			 }
		}while(number<=0||number>=1000);
		//Xet dieu kien neu de bai yeu cau
		
		// Tinh tong cac chu so trong so nguyen nhap vao.
		int lessThan10 = number % 10;		// Lay ra chu so hang don vi
		number /= 10;							// Bo di chu so hang don vi trong so nguyen ban dau
		int tens = number % 10;				// lay ra chu so hang chuc, bay gio la hang don vi cua so hien tai
		number /= 10;							// Bo di so vua lay
		int hundreds = number % 10;		// lay chu so hang tram cua so nguyen ban dau
		number /= 10;							// Bo di so vua lay, buoc danh cho viec xet dieu kien doi voi so lon hon 3 chu so
		int sum = hundreds + tens + lessThan10;	//Tinh tong

		// In ket qua
		System.out.println("Tong cac chu so trong so nguyen ban dau: "+lessThan10+" + "+tens+" + "+hundreds+" = " + sum);
	}
}

class Bai02{
	public void run(){
		System.out.println("    J     A    V     V    A");
		System.out.println("    J    A A    V   V    A A");
		System.out.println("J   J   AAAAA    V V    AAAAA");
		System.out.println(" J J   A     A    V    A     A");
	}
}

class Bai03{
	public static void run(){
		Scanner input = new Scanner(System.in);

		// Yeu cau nguoi dung nhap va thang va nam - xet dieu kien nhap neu de bai yeu cau
		System.out.print("Enter month: ");
		int month = input.nextInt();
		System.out.print("Enter year: ");
		int year = input.nextInt();
		
		//Tao bien dieu kien cho thang 2
		boolean leapYear = 
			(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			
		// Hien thi so ngay trong thang
		switch (month)
		{
			case 1: System.out.println(
					 "January " + year + " had 31 days"); break;
			case 2: System.out.println("February " + year + " had" +
					  ((leapYear) ? " 29 days" : " 28 days")); break;
			case 3: System.out.println(
					 "March " + year + " had 31 days"); break;
			case 4: System.out.println(
					 "April " + year + " had 30 days"); break;
			case 5: System.out.println(
					 "May " + year + " had 31 days"); break;
			case 6: System.out.println(
					 "June " + year + " had 30 days"); break;
			case 7: System.out.println(
					 "July " + year + " had 31 days"); break;
			case 8: System.out.println(
					 "August " + year + " had 31 days"); break;
			case 9: System.out.println(
					 "September " + year + " had 30 days"); break;
			case 10: System.out.println(
					 "October " + year + " had 31 days"); break;
			case 11: System.out.println(
					 "November " + year + " had 30 days"); break;
			case 12: System.out.println(
					 "December " + year + " had 31 days");
			default: //Day la noi xay dung cac truong hop khac
					break;
	}
}
}

class Bai04{
	public static void run(){
		// Tao doi tuong Scanner
		Scanner input = new Scanner(System.in);

		// Yeu cau nguoi dung nhap vao so luong sinh vien
		System.out.print("Nhap so sinh vien: ");
		int numberOfStudents = input.nextInt();

		int score, 					// Khai bao bien luu diem sinh vien		
			 highest = 0, 			// Bien luu diem cao nhat
			 secondHigest = 0;	// Diem cao nhi`
		String name = "", 		// Bien luu ten sinh vien
				 student1 = "", 	// Bien luu ten sinh vien cao diem nhat
				 student2 = "";	// ten sinh vien cao diem nhi`
		
		// Yeu cau nguoi dung nhap vao ten va diem cua sinh vien
		System.out.println("Enter each students' name and score:");
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print(
				"Sinh vien: " + (i + 1) + "\n   ten la: ");
			name = input.next();
			System.out.print("   Co diem: ");
			score = input.nextInt();

			if (i == 0) {
				// Gan diem va ten sinh vien vua nhap vao diem cao nhat va ten sinh vien co diem cao nhat
				highest = score;
				student1 = name;
			}
			else if (i == 1 && score > highest) {
				// Truong hop nhap sinh vien thu 2 cao diem hon sinh vien thu nhat
				secondHigest = highest;
				highest = score;
				student2 = student1;
				student1 = name;
			}
			else if (i == 1) {
				// Truong hop thap diem hon
				secondHigest = score;
				student2 = name;
			}		
			else if (i > 1 && score > highest && score > secondHigest) {
				// Truong hop nhap sinh vien thu 3 tro di co diem cao hon 2 sinh vien kia
				secondHigest = highest;
				student2 = student1;
				highest = score;
				student1 = name;
			}
			else if (i > 1 && score > secondHigest) {
				// Truong hop nhap sinh vien thu 3 tro di co diem cao hon sinh vien cao diem thu 2 
				student2 = name;
				secondHigest = score;
			}
		}

		// Hien thi sinh vien diem so cao nhat va cao thu 2
		System.out.println(
			"Sinh vien cao diem nhat la: " + student1 + " voi so diem: "+highest+ 
			"\nSinh vien cao diem thu 2 la: " + student2 +" voi so diem: "+ secondHigest);
	}
}

class Bai05{
	//chua lam
}

class Bai06{
	public static void run(){
			String months[] = {
			"Jan", "Feb", "Mar", "Apr",
      		"May", "Jun", "Jul", "Aug",
      		"Sep", "Oct", "Nov", "Dec"};
		// Tao doi tuong GregorianCalendar
		GregorianCalendar calender = new GregorianCalendar();

		// Hien thi ngay thang nam hien tai theo dinh dang Thang/Ngay/Nam
		System.out.print("\nCurrent year, month, and day in format Mth/Day/Year: ");
		System.out.println(months[calender.get(calender.MONTH)] + "/" +
			calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));

		// Cai dat thoi gian troi qua tu 1/1/1970 to 1234567898765 giay.
		calender.setTimeInMillis(1234567898765L);

		// Hien thi ngay thang nam luc do
		System.out.print("\nElapsed time since January 1, 1970 set to " +
			"1234567898765L in format Mth/Day/Year: ");
		System.out.println(months[calender.get(calender.MONTH)] + "/" +
			calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));
	}
}
//
//class StopWatch cho bai 7
// Hien thuc lop
class StopWatch {
	private long startTime; // Start time
	private long endTime;	// End time

	// constructor no-arg khoi tao startTime 
	// la thoi gian hien hanh
	StopWatch() {
		startTime = System.currentTimeMillis();
	}

	// Cai dat thoi gian bat dau la thoi gian hien hanh
	public void start() {
		startTime = System.currentTimeMillis();
	} 

	// Cai dat thoi gian ket thuc la thoi gian hien hanh
	public void stop() {
		endTime = System.currentTimeMillis();
	}

	// Tra ve thoi gian bam gio  
	// theo milliseconds
	public long getElapsedTime() {
		return getEndTime() - getStratTime();
	}

	// tra ve thoi gian bat dau
	public long getStratTime() {
		return startTime;
	}

	// tra ve thoi gian ket thuc
	public long getEndTime() {
		return endTime;
	}
}

class Bai07{
	public static void run(){
		// Tao doi tuong StopWatch
		StopWatch stopWatch = new StopWatch();

		// Tao mang 100 000 so ngau nhien
		int[] randomArray = getArray();

		// Goi phuong thuc start() bat dau tinh gio
		stopWatch.start();

		// thuc hien thuat toan selection sort
		selectionSort(randomArray);

		// Goi phuong thuc stop() ket thuc tinh gio
		stopWatch.stop();

		// Hien thi thoi gian bat dau, ket thuc va thuc thi
		System.out.println("Start time: " +stopWatch.getStratTime()+ " milliseconds");
		System.out.println("Stop time: " +stopWatch.getEndTime()+ " milliseconds");
		System.out.println("The execution time of sorting 100,000 " +
			"numbers using selection sort: " + stopWatch.getElapsedTime() +
			" milliseconds");
	}

	/** getArray tao tra ve mang 100 000 so ngau nhien */
	public static int[] getArray() {
		// Create an array of length 100,000
		int[] array = new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100000);
		}
		return array;
	}

	/** selection sort */
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = array[i];
			int minIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}

			if (i != minIndex) {
				array[minIndex] = array[i];
				array[i] = min;
			}
		}
	}
}


//Bai 8 minh chi lam mot class circle
class Circle{
	//Xay dung tuong tu xay dung class Circle tren
	double radius;
	
	//Constructor no-arg
	Circle(){
		radius = 1;
	}
	
	//Constructor with a specified radius
	Circle(double newRadius){
		radius = newRadius;
	}
	
	/** Phuong thuc tra ve dien tich hinh tron */
	double getArea() {
		return radius * radius * Math.PI;
	}
	/** tra ve chu vi */
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	/** cai dat bn kinh - setter */
	void setRadius(double newRadius) {
		radius = newRadius;
	}
	//Day la phuong thuc main() khi ban thuc thi trong file khac
	//Do minh khoi tao trong cung file Bai01 nay, nen minh se chuyen no thanh phuong thuc excute() de goi trong phuong thuc main() cua file nay
	public static void excute(){
		// Create a circle with radius 1
		Circle circle1 = new Circle();
		System.out.println("The area of the circle of radius "
		+ circle1.radius + " is " + circle1.getArea());
		
		// Create a circle with radius 25
		Circle circle2 = new Circle(25);
		System.out.println("The area of the circle of radius "
		+ circle2.radius + " is " + circle2.getArea());
		
		// Create a circle with radius 125
		Circle circle3 = new Circle(125);
		System.out.println("The area of the circle of radius "
		+ circle3.radius + " is " + circle3.getArea());
		
		// Modify circle radius
		circle2.radius = 100; // or circle2.setRadius(100)
		System.out.println("The area of the circle of radius "
		+ circle2.radius + " is " + circle2.getArea());
	}
}

//class Stock cho bai 9
class Stock{
	String symbol; //Ma chung khoang
	String name; //Ten chung khoang
	double previousClosingPrice; //Gia dong cua ngay hom qua
	double currentPrice; //Gia hien tai
	
	//Constructor with a specified symbol and name
	Stock(String newSymbol, String newName){
		symbol = newSymbol;
		name = newName;
	}
	
	//Tra ve ty le phan tram thay doi gia giua gia hom truoc va hien tai
	double getChangePercent(){
		return ((currentPrice - previousClosingPrice)/previousClosingPrice)*100;
	}
}
//Bai 9
class Bai09{
	public static void run(){
		//Tao mot doi tuong Stock voi symbol ORCL, name Oracle Corporation
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		stock.previousClosingPrice = 34.5;
		stock.currentPrice = 34.35;
		
		//Hien thi
		System.out.println("\nStock name: " +stock.name);
		System.out.println("Stock symbol: " +stock.symbol);
		System.out.printf("Price-change percentage: %.2f%%\n" , stock.getChangePercent());
	}
}

//Minh chi de 1 cai UML cho bai 10, cac bai kia cac ban ve tuong tu
//UML bai 10
/***********************
*         Fan          *
* ---------------------*
* +SLOW: int           *
* ----------           *
* +MEDIUM: int         *
* ------------         *
* +FAST: int           *
* ----------           *
* -speed: int          *
* -on: boolean         *
* -radius: double      *
* +color: String       *
* +Fan()               *
* +setSpeed(int)       *
* +turnOn()            *
* +turnOff()           *
* +setRadius(double):  *
* +setColor(String):   *
* +getSpeed(): String  *
* +isOn(): boolean     *
* +getRadius(): double *
* +getColor(): String  *
* +toString(): String  *
***********************/
//class Fan bai 10
class Fan{
	//DInh nghia cac bien tinh trong lop
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	
	//Dinh nghia cac bien du lieu
	private int speed;
	private boolean on;
	private double radius;
	String color;
	
	//COnstructor no-arg that creates a default fan
	Fan(){
		speed = SLOW;
		on = false;
		radius = 5;
		color = "pink";
	}
	
	//Mutator methods
	//Sets speed
	public void setSpeed(int newSpeed){
		speed = newSpeed;
	}
	
	//Sets fan on
	public void turnOn(){
		on = true;
	}
	
	//Sets fan off
	public void turnOff(){
		on = false;
	}
	
	//Sets color
	public void setColor(String newColor){
		color = newColor;
	}
	
	//Sets radius
	public void setRadius(double newRadius){
		radius = newRadius;
	}
	
	//Access methods
	//Return speed
	public String getSpeed(){
		String s = "";
		switch (speed){
			case SLOW: s="SLOW"; break;
			case MEDIUM: s="MEDIUM"; break;
			case FAST: s="FAST"; break;
		}
		return s;
	}
	
	//return on
	public boolean isOn(){
		return on;
	}
	
	//return radius
	public double getRadius(){
		return radius;
	}
	
	//return color
	public String getColor(){
		return color;
	}
	
	//return a string description for the fan
	public String toString(){
		if (on == true){
			return "\nFan speed: " + getSpeed() + ", color: " + getColor() + ", radius: " + getRadius()+ "\n";
		}
		else{
			return "\nFan color: " + getColor() +  ", radius: " + getRadius()+ "\nfan is off\n";
		}
	}
}

//Bai 10
class Bai10{
	public static void run(){
		//Create two Fan objects
		Fan fan01 = new Fan();
		Fan fan02 = new Fan();
		
		//Assige maximum speed, radius 10, color yellow,
		//and turn it on to the first object
		fan01.setSpeed(Fan.FAST);
		fan01.setRadius(10);
		fan01.setColor("yellow");
		fan01.turnOn();
		
		//Assige medium speed, radius 5, color pink,
		//and turn it off to the second
		fan02.setSpeed(Fan.MEDIUM);
		fan02.setRadius(5);
		fan02.setColor("blue");
		fan02.turnOff();
		
		//Display the objects by invoking their toString method
		System.out.println(fan01.toString());
		System.out.println(fan02.toString());
	}
}