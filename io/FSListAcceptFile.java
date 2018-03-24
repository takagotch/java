//public abstract boolean accept(File f)

File dir = new File("chap5/data");

File[] filtList = dir.listFiles(new FileFilter(){
  public boolean accept(File file){
    return file.idDirectory();
  }
});
for (File tmp : filtList){
  System.out.println("Dir List: " + tmp.getName());
}


