let data = [
    {
        champion_name: 'Ahri',
        champ_role: 'mage',
        preferred_lane: 'mid'
    },
    {
        champion_name: 'Lux',
        champ_role: 'mage',
        preferred_lane: 'mid'
    },
    {
        champion_name: 'Malphite',
        champ_role: 'bruiser',
        preferred_lane: 'top'
    },
    {
        champion_name: 'Teemo',
        champ_role: 'being toxic',
        preferred_lane: 'none'
    },
    {
        champion_name: 'Lee Sin',
        champ_role: 'fighter',
        preferred_lane: 'jungle'
    },
    {
        champion_name: 'Draven',
        champ_role: 'adc',
        preferred_lane: 'bot'
    },
    {
        champion_name: 'Braum',
        champ_role: 'tank',
        preferred_lane: 'bot'
    },
]


let goodData = data.filter(ele => ele.champ_role !== 'being toxic')
                    .map(ele => {
                        return {
                            championName: ele.champion_name,
                            championRole: ele.champ_role
                        }
                    });

console.log(goodData);