//public PipedReader([PipedWriter src])
//public pipedReader([PipedWriter src,] int pipeSize)
//public void connect(PipedWriter src)

try(PipedReader reader = new PipedReader();
    PipedWriter writer = new PipedWriter();){
	reader.connect(writer);

	writer.write("SAMPLE");

	while(reader.ready())
		System.out.printf("%c", reader.read());
}


