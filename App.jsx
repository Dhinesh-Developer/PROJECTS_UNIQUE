
import './App.css'

function App() {
  // const element = <h1>Hello world</h1>
  // //JSX attribute use camelCase Conversion
  // //{} java Script code embedded in this tag
  // const name = "Dhinesh"
  // const buttonLabel = "Click me"
  // const imageUrl = 'https://placehold.co/100x100';

  const isLoggedIn = true;
  // if(isLoggedIn){
  //   return (<h1>Welcome User</h1>);
  // }
  // return <h1>Please log in</h1>

    const element  = <h1>{isLoggedIn? "Welcome back!" : "Please logged in" }</h1>

    const message = ["1","message","hai"];

  // conditional Rendering.
  // function

  function WelcomeMessage(name){
    return <h1>Hello, {name}</h1>
  }

  function greeting(isMorning){
    if(isMorning){
      return <h1>Good Morning</h1>
    }else{
      return <h1>Good Evening</h1>
    }
  }


  function showAlert(Condition, message){
    if(condition){
      return <div>{message}</div>
    }
    return null;
  }

  const now = new Date();
  const isMorning = now.getHours() <12;
  return (
   
    <div>
      {/* {element}
      <h1 className='greeting'>Hello from {name}</h1>
      <button style={{backgroundColor:'green', color:'aliceblue'}}> 
        {buttonLabel}</button>

        <button onClick={() => alert(`button clicked`)}>ALert me</button>
        <br></br>
        <img src={imageUrl}></img>

        <button onClick={() => alert(`i am fine`)}>Hai How are you</button> 
        
         {element}
        {message.length >0 && <h2>you have { message.length} messages </h2>}*/}
        {WelcomeMessage("kumar")}
        <h1>Hello</h1>
        <h1>Hello ,bro</h1>
        {WelcomeMessage("dhinesh")}

        {greeting(isMorning)}
        {showAlert(true,"this is an alert")}
       

    </div>
  )
}

export default App
