//public PipedInputStream([PipedOutputStream src])
//public PipedInputStream([PipedOutputStream src,] int pipeSize)
//public void connect(PipedOutputStream src)

try(PipedOutputStream poStream = new PipedOutputStream();
    PipedInputStream piStream = new PipedInputStream()){
	piStream.connect(poStream);

	poStream.wirte(new byte[] (1, 2, 3, 4, 5), 2, 3);

	byte[] rcv = new byte[piStream.available()];
	piStream.read(rcv);

	for(byte tmp :rcv)
		System.out.printf("%d", tmp);
}

