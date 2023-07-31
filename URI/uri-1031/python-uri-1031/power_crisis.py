while(True):
    number_of_regions = int(input())
    if(number_of_regions == 0):
        break

    step_size 		= 0
    regions_sample	= 3

    while(regions_sample >= 2):

        step_size	    	+= 1
        last_region 		= 12
        last_dropped_region = 1

        for regions_sample in range(number_of_regions - 1, 0, -1):

            dropped_region = (last_dropped_region + step_size - 1) % regions_sample

            if(last_region == dropped_region):
                break
            if(last_region > dropped_region):
                last_region -= 1

            last_dropped_region = dropped_region

    print(step_size)
