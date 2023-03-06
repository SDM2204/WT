class staticme {
	static int a = 40;
	int b = 50;
	void simpleDisplay()
	{
		System.out.println("Using normal method :");
		System.out.println(a);
		System.out.println(b);
	}

	// Declaration of a static method.
	static void staticDisplay()
	{
		System.out.println("Using static method :");
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		staticme obj = new staticme();
		obj.simpleDisplay();
		staticDisplay();
	}
}
