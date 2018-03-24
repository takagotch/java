//boolean accept(File dir, String name)

File dir = new File("chap5/data/");

File[] filtList = dir.listFiles(new FilenameFilter(){
  public boolean accept(File dir, String name){
    return name.endWidth(".gif");
  }
});
for(File tmp : filtList){
  System.out.println("GIF FILELIST: " + tmp.getName());
}


