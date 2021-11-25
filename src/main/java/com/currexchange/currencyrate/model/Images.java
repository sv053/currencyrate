package com.currexchange.currencyrate.model;

import lombok.Value;

@Value
public class Images {

 private Fixed_height fixed_height;
 private Fixed_height_still fixed_height_still;
 private Fixed_height_downsampled fixed_height_downsampled;
 private Fixed_width_small fixed_width_small;
 private Fixed_width_small_still fixed_width_small_still;
 private Fixed_height_small fixed_height_small;
 private Fixed_height_small_still fixed_height_small_still;
 private Downsized downsized;
 private Downsized_still downsized_still;
 private Downsized_large downsized_large;
 private Downsized_medium downsized_medium;
 private Downsized_small downsized_small;
 private Original original;
 private Original_still original_still;
 //private Looping looping;
 private Preview preview;
 private Preview_gif preview_gif;
}
