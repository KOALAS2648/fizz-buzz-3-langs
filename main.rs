fn main() {
    
    let mut _number:i32 = 1;
    let mut _counter:u32 = 0;
    while _counter != 101{
        println!("{}",fizz_buzz(_number));
        _counter +=1;
        _number +=1;
    }
    // it works

}
fn fizz_buzz(numb:i32)-> String{
    if numb%3 == 0 && numb%5 == 0{
        return "Fizz Buzz".to_string();
    }else if numb % 3 == 0{
       return "Fizz".to_string();
    }else if numb % 5 == 0{
        return "Buzz".to_string();
    }else{
        numb.to_string()
    }
}