package d20160518;

// Person Class Start.
public class Person 
{
	/* Member Variable */
	int ��;
	int ��;
	int ��;
	int ��;
	private String name;
	private String gender;
	private String job;
	private int age;
	
	/* Constructor */
	// Source - Generate Constructor using Fields ����� ����ϸ� �ڵ����� ���� �� ����. 
	Person(){
		// Default Constructor
		this.�� = 2;
		this.�� = 1;
		this.�� = 1;
		this.�� = 2;
		this.name = "ȫ�浿";
		this.gender = "����";
		this.job = "����";
		this.age = 20;
		System.out.println("Person�� �⺻ ������");
	}
	Person(String name, String gender, String job, int age)
	{
		// name, gender, job, age�� �Ű� ������ �Է� �޾� ��ü�� �ʱ�ȭ ��Ű�� Constructor.
		this(); // �Է� ���� ���� ������ ������ Member ������ �ʱ�ȭ �ϱ� ���� Default Constructor ȣ��.
		// �Է� ���� �Ű� ������ Member ���� �ʱ�ȭ
		this.name = name;
		this.gender = gender;
		this.job = job;
		this.age = age;
	}

	/* Getter/Setter Method */
	// Source - Generate Getters and Setters ��� ����ϸ� �ڵ����� ���� �� ����.
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
		// ��ü�� ������ ����ϴ� Method.
		System.out.println("==== " +  this.name + "�� ���� ====");
		System.out.println("�̸�: " + this.name);
		System.out.println("����: " + this.age);
		System.out.println("����: " + this.gender);
		System.out.println("����: " + this.job);
	}
	public void �Ա�()
	{
		System.out.println("������ �Ծ��.");
	}
	public void �ڱ�()
	{
		System.out.println("���� �ڿ�.");
	}
	public void �����ϱ�()
	{
		System.out.println("�����Ѵ� ��� �����Ѵ�.");
	}
}
// Person Class End.