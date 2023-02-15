public class VotingApp{
	/**
	 * @param age
	 * @throws InvalidAgeException
	 */
	void vote(int age)throws InvalidAgeException{
	if(age<18)
		throw new InvalidAgeException("Under 18");
	else
		System.out.println("Welcome to vote");

	}
	public static void main(String[] args) {
		VotingApp v = new VotingApp();
		try{
			v.vote(19);
			v.vote(17);
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Rest of the code");
	}
}