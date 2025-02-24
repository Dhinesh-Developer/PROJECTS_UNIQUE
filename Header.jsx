function Header(){
    const name = "DhineshKumar M";
    const profession = "Full stack java Developer"
    return(
        <div className='APP'>
            <header className='header'>
            <h1>{name}</h1>
            <p>{profession}</p>
            <nav>
                <a href="#about">About</a>
                <a href="#about">projects</a>
                <a href="#about">contact</a>
            </nav>
            </header>
    </div>
    );
}

export default Header;