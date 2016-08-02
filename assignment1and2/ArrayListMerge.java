package assignment1and2;
/**
 * THis class is to test the custom array list class
 */
public class ArrayListMerge {

		public static void main(String []args)
		{
			ArrayListOperations<String> array= new ArrayListOperations<String>();
			ArrayListOperations<String> array1= new ArrayListOperations<String>();
			
			
			array.add("10");
			array.add("Nikhil");
			array.add("Srivastava");
			array.add("N");
			array1.add("I");
			array1.add("K");
			array1.add("H");
			array1.add("I");
			array1.add("L");
			array.remove("10");
			array.remove(2);
			array1.sort();
			
			for(int i=0;i<array.getSize();i++)
			{
				System.out.print("  "+array.getElement(i));
			}
		
			System.out.println();
			for(int i=0;i<array1.getSize();i++)
			{
				System.out.print("  "+array1.getElement(i));
			}
			
			System.out.println();
			array.addAll(array1);
			for(int i=0;i<array.getSize();i++)
			{
				System.out.print("  "+array.getElement(i));
			}
		
			
			
		}
	}