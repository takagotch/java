//public PipedWriter([PipedReader snk])
//public void connect([PipedReader snk])

try(InputStreamReader ir = new InputStreamReader(System.in);
    Buffered Reader in = new BufferedReader(ir);
    PipedWriter pw = new PipedWriter();
    PipedReader pr = new PipedReader(pw);){
    System.out.print("Input : ");
    pw.write("[piped]" + in.readLine());
    
    int data;
    while((data = pr.read()) != -1){
      System.our.print((char) data);
    }
}

