import com.hib.controller.EmployeeController;

public class HIbernateApp {
    public static void main(String[] args) {
//        CreateUserTable cut = new CreateUserTable();
//        cut.createUserTable();


//        CreateUser cu = new CreateUser();
//        cu.createUser();

//        FindingUser findUser = new FindingUser();
//        findUser.findUser();

//        UpdateUser uu = new UpdateUser();
//        uu.updateUser();

//        DeleteUser deleteU = new DeleteUser();
//        deleteU.deleteUser();

//         HQLMethods hqlm = new HQLMethods();
//        hqlm.findUser();
//        hqlm.findUserSelect();
//        hqlm.getRecordbyId();

        EmployeeController ec = new EmployeeController();
//        ec.createEmployeeTable();
        ec.ShowOfficeCodes_AsDepartment();

    }

}
