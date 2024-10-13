package sample3;

public class UserServiceImpl implements UserService{

	public UserServiceImpl() {
		System.out.println("UserService 생성자 호출");
	}
	@Override
	public void addUser(UserVO vo) {
		System.out.println("이름 : " + vo.getUserName());
	}

}
