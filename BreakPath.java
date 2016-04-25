public class BreakPath{
	public static void main(String[] args){
		String path="C:/User/karma/Documents/AAJ JAVA/BreakPath.java";
		char driveLetter=path.charAt(0);
		int last_Slash=path.lastIndexOf('/');
		String paths=path.substring(0,last_Slash+1);
		int index_of_dot=path.indexOf('.');
		String file=path.substring(last_Slash+1,index_of_dot);
		String extension=path.substring(index_of_dot+1);
		System.out.println("Drive letter ="+driveLetter);
		System.out.println("Path="+path);
		System.out.println("File name="+file);
		System.out.println("File extension="+extension); 

	}
}