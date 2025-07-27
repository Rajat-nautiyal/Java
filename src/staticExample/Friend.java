package staticExample;
public class Friend {
	String name;
	//Without static, members would belong to specific objects, not the class itself.
	//You would need to create an object to access such members.

	    //In Java, static methods belong to the class and can be called without
    // creating an instance, but non-static methods belong to
    // an instance of the class and require an object to invoke them.

	static int numberOfFriends;
	
	Friend(String name){
		this.name = name;
		numberOfFriends++;
	}	
}//**********************************************