//public boolean equals(Object obj)

EqualsSample org = new EqualsSample();

EqualsSample obj1 = (EqualsSample)org.clone();
EqualsSample obj2 = org;

System.out.println(org.equals(obj1));
System.out.println(org.equals(obj2));

