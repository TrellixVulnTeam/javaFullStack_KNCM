
import {Pipe,PipeTransform} from '@angular/core'
import { pipe } from 'rxjs';

@Pipe({
    name:'title'
})
export class TitlePipe implements PipeTransform{

transform(name: string,gender: string): string{
if(gender==='male'){
    return 'Mr. '+name;
}else{
    return 'Mrs. '+name;
}
}



}

