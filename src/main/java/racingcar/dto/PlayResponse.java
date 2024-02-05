package racingcar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import racingcar.service.Car;

import java.util.List;

@AllArgsConstructor
@Getter
public class PlayResponse {
    String winners;
    List<Car> racingCars;
}
