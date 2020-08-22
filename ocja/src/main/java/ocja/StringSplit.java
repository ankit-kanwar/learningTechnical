package ocja;

public class StringSplit {

	public static void main(String[] args) {
		String str="BEVERAGE";
		String[] arr = str.split("E",3);
		System.out.println(arr.length);
		System.out.println(arr[0]+":"+arr[1]+":"+arr[2]);
		System.out.println(String.join(".", arr));
		
		String txt = "an";
		System.out.println(txt.split("an").length);
	}

}
