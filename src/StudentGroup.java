import java.util.Date;
import java.util.*;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	int i,j,sum=0;
	Scanner scan=new Scanner(System.in);
	int length=scan.nextInt();
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		for(i=0;i<length;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.println("%d",Student[i][j]);
			}
			System.out.println("\n");
		}
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		System.out.println("Enter no.of Students to be added");
		int s=scan.nextInt();
		length=length+s;
		for(i=0;i<length;i++)
		{
			for(j=0;j<5;j++)
			{
				if(j==0)
				Student[i][j]=scan.nextInt();
			   if(j==1)
				Student[i][j]=scan.nextString();
			   if(j==2)
				Student[i][j]=scan.nextDate();
			   if(j==3)
				Student[i][j]=scan.nextDouble();
				if(j==4)
				Student[i][j]=scan.nextInt();
		
			}
	   }
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		this.index=index;
		for(i=0;i<length;i++)
		{
			for(j=0;j<5;j++)
			{
				if(Student[i][0]=index)
				{
					System.out.println("%s",Student[i][1]);
				}
			}
		}	
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		this.student=student;
		this.index=index;
		length++;
		i=length;
		Student[length][0]=index;
		Student[length][1]=student;
		for(j=0;j<5;j++)
		{
			if(j==2)
				Student[i][j]=scan.nextDate();
			   if(j==3)
				Student[i][j]=scan.nextDouble();
				if(j==4)
				Student[i][j]=scan.nextInt();
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		this.student=student;
		Student[0][1]=student;
		length++;
		i=length;
			for(j=0;j<5;j++)
			{
				if(j==0)
				Student[i][j]=scan.nextInt();
	            if(j==2)
				Student[i][j]=scan.nextDate();
			    if(j==3)
				Student[i][j]=scan.nextDouble();
				if(j==4)
				Student[i][j]=scan.nextInt();
			}
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		this.student=student;
		length++;
		Student[length][1]=student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		this.student=student;
		this.index=index;
		length++;
		for(i=0;i<length;i++)
	   {
		for(j=0;j<5;j++)
		{
		}
	   }	
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		this.index=index;
		int id=index;
		int find;
	for(i=0;i<length;i++)
	 {
		for(j=0;j<5;j++)
		{
			if(Student[i][0]==id)
			{
				find=i;
			}
		}
	 }
	 for(j=0;j<5;j++)
	 {
		 Student[i][j]=NULL;
	 }
	 length--;
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		this.student=student;
		int id=index;
		int find;
	for(i=0;i<length;i++)
	 {
		for(j=0;j<5;j++)
		{
			if(Student[i][1]==student)
			{
				find=i;
			}
		}
	 }
	 for(j=0;j<5;j++)
	 {
		 Student[i][j]=NULL;
	 }
	 length--;
	}
	

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		this.index=index;
		int id=index;
		int find;
	for(i=0;i<length;i++)
	 {
		for(j=0;j<5;j++)
		{
			if(Student[i][0]==id)
			{
				find=i;
			}
		}
	 }
	 for(j=0;j<5;j++)
	 {
		 Student[i][j]=NULL;
	 }
	 length--;
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		this.index=index;
		int id=index;
		int find;
	for(i=0;i<length;i++)
	 {
		for(j=0;j<5;j++)
		{
			if(Student[i][0]==id)
			{
				find=i;
			}
		}
	 }
	 for(j=0;j<5;j++)
	 {
		 Student[i][j]=NULL;
	 }
	 length--;
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		this.student=student;
		int id=index;
		int find;
	for(i=0;i<length;i++)
	 {
		for(j=0;j<5;j++)
		{
			if(Student[i][1]==student)
			{
				find=i;
			}
		}
	 }
	 for(j=0;j<5;j++)
	 {
		 Student[i][j]=NULL;
	 }
	 length--;
	}
	}

	@Override
	public void bubbleSort() {
		int a[5],temp;
		System.out.println("enter elements of an array");
		for(i=0;i<5;i++)
		{
			a[i]=scan.nextInt();
		}
		for(i=0;i<5;i++)
		{
			for(j=4;j>i;j--)
			{
				if(a[j]<a[j-1])
				{
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		for(i=0;i<5;i++)
		{
			
			System.out.println("%d",a[i]);
        }			
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		Date d1=getCurrentDate();
		
		System.out.println("enter birthdate");
		Date d2=scan.nextDate();
		Date d3=diff(d1,d2);
		System.out.println("d3->days");
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		Date d1=getCurrentDate();
		
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		
		// Add your implementation here
		for(i=0;i<5;i++)
		{
		    if(age==Student[i][4])
			{
			System.out.println("%s",Student[i][1]);
			}
		}
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		for(i=0;i<5;i++)
		{
			sum=sum+Student[i][4];
		}
		sum=sum/i;
		System.out.println("%d",sum);
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		this.student=student;
		for(i=0; ;i++)
		{
			for(j=0; ;j++)
			{ 
		      if(Student[i][j]==student;
			  i++;
			  System.out.println("%s",Student[i][j]);
			}
		}
		return null;
	}
}
