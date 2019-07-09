//package microservices.book.multiplication.service;
//
//import microservices.book.multiplication.domain.Multiplication;
//import microservices.book.multiplication.domain.MultiplicationResultAttempt;
//import microservices.book.multiplication.domain.User;
//import microservices.book.multiplication.service.MultiplicationServiceImpl;
//import microservices.book.multiplication.service.RandomGeneratorService;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import static org.junit.Assert.assertThat;
//
//public class MultiplicationServiceImplTest {
//
//    private MultiplicationServiceImpl multiplicationServiceImpl;
//    @Mock
////    @Autowired
//    private RandomGeneratorService randomGeneratorService;
//
//    @Before
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//        multiplicationServiceImpl = new MultiplicationServiceImpl (randomGeneratorService);
//    }
//
//    @Test
//    public void createRandomMultiplicationTest() {
//// given (our mocked Random Generator service will return first 50, then 30) given(randomGeneratorService.generateRandomFactor()). willReturn(50, 30);
//// when
//        Multiplication multiplication = multiplicationServiceImpl.createRandomMultiplication();
//// assert
////        assertThat(multiplication.getFactorA()).isEqualTo(50);
////        assertThat(multiplication.getFactorB()).isEqualTo(30);
////        assertThat(multiplication.getResult()).isEqualTo(1500);
//
////        System.out.println(multiplication.getFactorA()+ "  "+ multiplication.getFactorB()+ "  "+ multiplication.getResult()+ "  ");
//    }
//
//
////    @Test
////    public void checkCorrectAttemptTest() {
////
////        Multiplication multiplication = new Multiplication(50, 60);
////        User user = new User("john_doe");
////        MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user, multiplication, 3000);
////
////        boolean attemptResult = multiplicationServiceImpl.checkAttempt(attempt);
////
////        System.out.println(attemptResult);
//////        assertThat(attemptResult).isTrue();
////    }
////    @Test
////    public void checkWrongAttemptTest() {
////        Multiplication multiplication = new Multiplication(50, 60);
////        User user = new User("john_doe");
////        MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user, multiplication, 3010);
////        boolean attemptResult = multiplicationServiceImpl.checkAttempt(attempt);
//////        assertThat(attemptResult).isFalse();
////        System.out.println(attemptResult);
////    }
//
//}