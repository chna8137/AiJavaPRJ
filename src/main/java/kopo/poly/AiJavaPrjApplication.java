package kopo.poly;

import kopo.poly.dto.OcrDTO;
import kopo.poly.service.IOcrService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class AiJavaPrjApplication implements CommandLineRunner {

    //@service 정의된 자바 파일
    //Spring Frameworks 실행될 때, @service 정의한 자바는 자동으로 메모리에 올림
    //메모리에 올라간 OcrService 객체를 ocrService 변수에 객체 넣어주기

    private final IOcrService ocrService; // 이미지 인식
    public static void main(String[] args) {
        SpringApplication.run(AiJavaPrjApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        log.info("자바 프로그래밍 시작!!");

        String filePath = "image"; // 문자열을 인식할 이미지 파일 경로
        String fileName = "sample02.png"; // 문자열을 인식할 이미지 파일 이름

        // 전달한 값(parameter) 약자로 보통 변수명 앞에 p을 붙임 ==> pDTO
        OcrDTO pDTO = new OcrDTO();

        pDTO.setFilePath(filePath);
        pDTO.setFileName(fileName);

        // 실행 결과(result) 약자로 보통 변수명 앞에 r을 붙임 ==> rDTO
        OcrDTO rDTO = ocrService.getReadforImageText(pDTO);

        String result = rDTO.getResult(); // 인식된 문자열

        log.info("인식된 문자열");
        log.info(result);

        log.info("자바 프로그램 종료!!");

    }
}
