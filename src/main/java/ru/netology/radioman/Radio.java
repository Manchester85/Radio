package ru.netology.radioman;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {


    private int quantityStation = 10;
    private int newStation;
    private int newVolume;
    private int minStation = 0;
    private int maxStation = 10;
    private int minVolume = 0;
    private int maxVolume = 100;

}






