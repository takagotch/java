//switch(expression){
//  case const1:
//    break;
//  [ case constn:
//    break; ]
//  [ default :
//    break; ]
//}

switch(value){
  case 1:
	  System.out.println("first");
	  break;
  case 2:
	  System.out.println("second");
	  break;
}

switch(value){
  case 1:
	  System.out.println("first");
  case 2:
  case 3:
	  System.out.println("second");
	  break;
}

String str_value = "abc";
switch (str_value){
  case "abc":
	  System.out.println(str_value);
	  break;
  case "def":
	  System.out.println(str_value);
	  break;
}


