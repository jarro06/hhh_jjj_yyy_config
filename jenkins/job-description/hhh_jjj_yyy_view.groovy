 
listView('hhh_jjj_yyy Jobs') {
    description('hhh_jjj_yyy Jobs')
    jobs {
        regex('hhh_jjj_yyy_.+')
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
