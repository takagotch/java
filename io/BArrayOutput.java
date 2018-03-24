//public ByteArrayOutputStream([int initialiSize])

byte[] bytes = new byte[] { 1, 2, 3 };
try(ByteArrayInputStream is = new ByteArrayInputStream(bytes);
    ByteArrayOutputStream os = new ByteArrayOutputStream();){

	int i = -1;
	while((i = is.read()) > 0){
	  System.out.printf("%d", i);
	  os.write(-i);
	}

	byte[] b = os.toByteArray();
	for(byte j : b){
	  System.out.printf("%#x", j);
	}
}




