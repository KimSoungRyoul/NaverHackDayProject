import React from 'react'
import ContactTable from "./ContactTable";

const testContacts = [{
  serial_num: '123',
  name: 'test',
  phoneNum: '010-1234-5678'
}, {
  serial_num: '456',
  name: 'test2',
  phoneNum: '010-4567-5678'
}]

class ContactPage extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      pageNumber: 1,
      contacts: null,
      checkContacts: null,
    }
  }

  _setCheckContacts(contacts) {
    this.setState({
      checkContacts: contacts,
    })
  }

  handleSubmit(event) {

    event.preventDefault();
  }

  render() {
    let topFunctions = (
        <div>
          <form>
            <input type="text" placeholder="연락처 검색"
                   ref={(input) => this.search = input}/>
            <input type="submit" value="검색" onClick={this.handleSubmit}/>
            <span>{this.props.groupName}</span>
          </form>
          <input type="button" value="수정"/>
          <input type="button" value="삭제"/>
        </div>
    );

    let bottomFunctions = (
        <div>
          <input type="button" value="<<"/>
          <input type="button" value="<"/>
          <span>{this.state.pageNumber}</span>
          <input type="button" value=">"/>
          <input type="button" value=">>"/>
        </div>
    );

    return (
        <div>
          {topFunctions}
          <ContactTable contacts={testContacts}
                        _setCheckContacts={(contacts) => {
                          this._setCheckContacts(contacts)
                        }}/>
          {bottomFunctions}
        </div>
    )
  }
}

export default ContactPage;