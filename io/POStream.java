//public PipedOutputStream([PipedInputStream snk])
//public void connect(PipedInputStream snk)

try(pipedinputstream pistream = new pipedinputstream();
    pipedoutputstream postream = new pipedoutputstream(pistream);){
	postream.write("12345".getbytes());

	byte[] rcv = new byte[pistream.available()];
	pistream.read(rcv);

	for( byte tmp: rcv )
		system.out.printf("%x", tmp);
}

