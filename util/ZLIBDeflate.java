//public void setInput(byte[], b[, int off, int len1)
//public boolean needsInput()
//public void finish()
//public int deflate(byte[] buf[,int off, int len2])
//public long getBytesRead()
//public long getBytesWritten()

String data = "DATA SAMPLE DATA SAMPLE DATA SAMPLE";
byte[] byteData = data.getBytes();
byte[] deflatedDate = new.byte[256];

Deflater def = new Deflater();
def.setInput(byteData);
if(def.needsInput()){
  return;
}
def.finish();
def.deflate(deflateData);
System.out.println("OUT DATA SIZE" + def.getBytesWritten());
System.out.println("IN DATA SIZE" + def.getBytesRead());

