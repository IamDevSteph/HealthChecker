import { Route, Switch } from 'react-router-dom';

import AboutDevsScreen from '../../pages/aboutdevs-screen';
import ContactScreen from '../../pages/contact-screen';
import ErrorScreen from '../../pages/errorpage-screen';
import FaqScreen from '../../pages/faq-screen';
import LandingpageScreen from '../../pages/landingpage-screen';
import LoginScreen from '../../pages/login-screen';
import ProfileScreen from '../../pages/profile-screen';
import SignupScreen from '../../pages/signup-screen';
import UserhomeScreen from '../../pages/userhome-screen';



const AppRouter = () => {
    return (
        <Switch>
            <Route exact path={'/about-developers'} component={AboutDevsScreen} />
            <Route exact path={'/contact'} component={ContactScreen} />
            <Route exact path={'*'} component={ErrorScreen} />
            <Route exact path={'/faq'} component={FaqScreen} />
            <Route exact path={'/'} component={LandingpageScreen} />
            <Route exact path={'/login'} component={LoginScreen} />
            <Route exact path={'/profile'} component={ProfileScreen} />
            <Route exact path={'/signup'} component={SignupScreen} />
            <Route exact path={'/home'} component={UserhomeScreen} />
        </Switch>
    );
}

export default AppRouter;