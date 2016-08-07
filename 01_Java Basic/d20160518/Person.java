package d20160518;

// Person Class Start.
public class Person 
{
	/* Member Variable */
	int 눈;
	int 코;
	int 입;
	int 귀;
	private String name;
	private String gender;
	private String job;
	private int age;
	
	/* Constructor */
	// Source - Generate Constructor using Fields 기능을 사용하면 자동으로 만들 수 있음. 
	Person(){
		// Default Constructor
		this.눈 = 2;
		this.코 = 1;
		this.입 = 1;
		this.귀 = 2;
		this.name = "홍길동";
		this.gender = "남자";
		this.job = "도둑";
		this.age = 20;
		System.out.println("Person의 기본 생성자");
	}
	Person(String name, String gender, String job, int age)
	{
		// name, gender, job, age의 매개 변수를 입력 받아 객체를 초기화 시키는 Constructor.
		this(); // 입력 받은 값을 제외한 나머지 Member 변수를 초기화 하기 위한 Default Constructor 호출.
		// 입력 받은 매개 변수로 Member 변수 초기화
		this.name = name;
		this.gender = gender;
		this.job = job;
		this.age = age;
	}

	/* Getter/Setter Method */
	// Source - Generate Getters and Setters 기능 사용하면 자동으로 만들 수 있음.
	public void setName(String name){this.name = name;}
	public String getName(){return this.name;}
	// Name getter/setter.
	public void setGender(String gender){this.gender = gender;}
	public String getGender(){return this.gender;}
	// Gender getter/setter.
	public void setJob(String job){this.job = job;}
	public String getJob(){return this.job;}
	// Job getter/setter.
	public void setAge(int age){this.age = age;}
	public int getAge(){return this.age;}
	// Age getter/setter.
	
	/* Member Method */
	public void personInfo()
	{
		// 객체의 정보를 출력하는 Method.
		System.out.println("==== " +  this.name + "의 정보 ====");
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("성별: " + this.gender);
		System.out.println("직업: " + this.job);
	}
	public void 먹기()
	{
		System.out.println("맛난걸 먹어요.");
	}
	public void 자기()
	{
		System.out.println("쿨쿨 자요.");
	}
	public void 생각하기()
	{
		System.out.println("생각한다 고로 존재한다.");
	}
}
// Person Class End.