//public int inflate(byte[] buf[, int off, int len2])

String data = "DATA SAMPLE DATA SAMPLE DATA SAMPLE";
byte[] byteData = data.getBytes();
byte[] deflatedData = new byte[256];

try{
  Deflater def = new Deflater();
  def.setInput(byteData);
  def.finish();
  def.deflate(deflatedData);

  Inflater inf = new Inflater();
  inf.setInput(deflatedData);

  byte[] inflatedData = new byte[256];

  inf.inflate(inflatedData);
  System.out.println(new String(inflatedData));
}

