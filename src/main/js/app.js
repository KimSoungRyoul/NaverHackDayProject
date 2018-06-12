'use strict';

const React = require('react');
const ReactDOM = require('react-dom');
import SideBar from './component/SideBar'
import Container from './component/Container'
import ContactInformation from "./component/ContactInformation";
import Popup from "./component/Popup";

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      activateFunction: 'All_Contacts',
      /* 필요한 state */
      // All_Contacts, Group_Contacts, Tag_Contacts, Name_Contacts
      // InsertContact, ModifyContact, DeleteContact
      // InsertGroup, ModifyGroup, RemoveGroup
      // FrequentlyUseContact
      // SelectDuplicateContact, SelectSimilarContact
      // DetailContact
      prevActivateFunction: '',
      groupName: '전체 연락처',
      checkContacts: null,
    };
  }

  _setCheckContactsAndsetActivateFunction(func, contacts) {
    this.setState((prevState) => ({
      activateFunction: func,
      prevActivateFunction: prevState.activateFunction,
      checkContacts: contacts,
    }))
  }

  _setActivateFunction(func) {
    this.setState((prevState) => ({
      activateFunction: func,
      prevActivateFunction: prevState.activateFunction,
    }))
  }

  _closePopupWindow() {
    this.setState({
      activateFunction: this.state.prevActivateFunction,
    })
  }

  render() {
    let insertContact = (this.state.activateFunction === 'InsertContact' ?
        <ContactInformation
            activateFunction={this.state.activateFunction}
            _closePopupWindow={this._closePopupWindow.bind(this)}
        /> : '');

    let popup = (this.state.activateFunction === 'ModifyGroup' ?
            <Popup
                activateFunction={this.state.activateFunction}
                _closePopupWindow={this._closePopupWindow.bind(this)}
            /> : ''
    );

    return (
        <div style={divStyle}>
          <nav style={headerStyle}>NAVER 스마트 주소록</nav>
          <SideBar _setActivateFunction={(func) => {
            this._setActivateFunction(func)
          }}/>
          <Container
              groupName={this.state.groupName}
              _setCheckContactsAndsetActivateFunction={(func, contacts) => {
                this._setCheckContactsAndsetActivateFunction(func, contacts)
              }}
          />
          {insertContact}
          {popup}
        </div>
    )
  }
}

const headerStyle = {
  width: '100%',
  height: '50px',
  border: '1px solid black',
}

const divStyle = {
  height: '100%',
  width: '100%',
}

ReactDOM.render(
    <App/>,
    document.getElementById('react')
)