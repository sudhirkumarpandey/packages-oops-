 package pack1;

class A 
{
	public static void main(String[] args) 
	{
		System.out.println("from pack1.A");
	}
}


/*
	package
	-------
	1. create a folder with a package name inside a src folder
	2. save java file inside a package folder with a package as package_folder_name
	3. compilation should be from src.
	src>javac -d ../classes package_name/java_file_name
	4. automatically package folder created inside a classes folder
	5. running should be with a package name
	src>java -cp ../classes pack1.A
	6. why do we require packages????
	  1. grouping similar kind of classes as a one group in one package.
	  2. avoiding naming collisions.






*/
