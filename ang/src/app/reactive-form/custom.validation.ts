import { AbstractControl, ValidationErrors } from '@angular/forms';



// tslint:disable-next-line:class-name
export class customValidation {
    constructor(){}
    static unique (control:AbstractControl):ValidationErrors | null {
        if (control.value === 'priyakhandre57@gmail.com'){
            return { unique:true};
        }else {
            return null;
        }
    }
}
