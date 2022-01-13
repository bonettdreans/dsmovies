import { ReactComponent  as GitHubIcon } from 'assets/img/github-icon.svg'
import './styles.css'
function Navbar (){
    return (
        <header>
        <nav className="container">
          <div className= "dsmovie-nav-content"> 
            <h1>DSTTMovie</h1>
            <a href="https://github.com/bonettdreans"></a>
            <div className="dsmovie-contact-container">
              <GitHubIcon />
              <p className="dsmovie-contact-link">
                /DSTTMovie
              </p>
            </div>
          </div>
        </nav>
      </header>
    );
}

export default Navbar;