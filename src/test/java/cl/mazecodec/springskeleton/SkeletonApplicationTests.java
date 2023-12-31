package cl.mazecodec.springskeleton;

import cl.mazecodec.springskeleton.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class SkeletonApplicationTests {

  @Autowired
  private HomeController controller;

  @Test
  void contextLoads() {
    assertThat(controller).isNotNull();
  }

}
