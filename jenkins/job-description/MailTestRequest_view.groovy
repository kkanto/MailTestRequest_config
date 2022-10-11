 
listView('MailTestRequest Jobs') {
    description('MailTestRequest Jobs')
    jobs {
        regex('MailTestRequest_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
