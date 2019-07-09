//package microservices.book.multiplication.service;
//
//import microservices.book.multiplication.service.RandomGeneratorService;
//import microservices.book.multiplication.service.RandomGeneratorServiceImpl;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//import java.util.stream.Collectors; import java.util.stream.IntStream;
//
//import static org.junit.Assert.assertThat;
//
//
//public class RandomGeneratorServiceImplTest {
//
////    @Autowired
//    private RandomGeneratorServiceImpl randomGeneratorServiceImpl;
//
//    @Before
//    public void setUp() {
//        randomGeneratorServiceImpl = new RandomGeneratorServiceImpl();
//    }
//    @Test
//    public void generateRandomFactorIsBetweenExpectedLimits() throws Exception {
//        // when a good sample of randomly generated factors is generated
//        List<Integer> randomFactors = IntStream.range(0, 1000)
//                .map(i -> randomGeneratorServiceImpl.generateRandomFactor())
//                .boxed().collect(Collectors.toList());
//        for (Integer i: randomFactors) {
//            System.out.println(i);
//        }
//    }
//}