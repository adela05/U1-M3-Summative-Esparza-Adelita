package com.company.U1M3SummativeEsparzaAdelita;

import org.springframework.http.HttpStatus;
import org.springframework.lang.UsesSunHttpServer;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class WebServiceController {
    private List<Quote> quoteList;
    private List<Word> wordList;
    private List<MagicEight> magicEightList;

    // Quote Class
    public WebServiceController(){
        quoteList = new ArrayList<>();
        quoteList.add(new Quote("George Bernard Shaw", "Life isn't about finding yourself. Life is about creating yourself."));
        quoteList.add(new Quote("Audrey Hepburn", "The most import thing is to enjoy your life-to be happy-it's all that matters."));
        quoteList.add(new Quote("Arthur Rubinstein", "I have found that if you love life, life will love you back."));
        quoteList.add(new Quote("Confucius", "Life is really simple, but we insist on making it complicated. "));
        quoteList.add(new Quote("Abraham Lincoln", "In the end, it's not the years in your life that count. It's the life in your years."));
        quoteList.add(new Quote("Thomas Jefferson", "Coffee: the favorite drink of the civilized world."));
        quoteList.add(new Quote("Steve Jobs", "Your time is limited, so don't waste it living someone else's life."));
        quoteList.add(new Quote("Jimmy Johnson", "Do you want to be safe and good, or do you want to take a chance and be great?"));
        quoteList.add(new Quote("John Sculley", "If you aren't making some mistakes, you aren't taking enough chances."));
        quoteList.add(new Quote("Walt Disney", "The way to get started is to quit talking and begin doing."));
        // Word Class
        wordList = new ArrayList<>();
        wordList.add(new Word("achieve", "to bring to a successful end; carry through; accomplish."));
        wordList.add(new Word("sound", "the sensation produced by stimulation of the organs of hearing by vibrations transmitted through the air or other medium."));
        wordList.add(new Word("marvel", "something that causes wonder, admiration, or astonishment; a wonderful thing; a wonder or prodigy"));
        wordList.add(new Word("contrast", "to compare in order to show unlikeness or differences; note the opposite natures, purposes, etc., of"));
        wordList.add(new Word("share", "the full or proper portion or part allotted or belonging to or contributed or owed by an individual or group."));
        wordList.add(new Word("launch", "to float (a newly constructed boat or ship) usually by allowing to slide down inclined ways into the water."));
        wordList.add(new Word("element", "a component or constituent of a whole or one of the parts into which a whole may be resolved by analysis"));
        wordList.add(new Word("border", "the part or edge of a surface or area that forms its outer boundary."));
        wordList.add(new Word("audio", "Electronics. designating an electronic apparatus using audio frequencies:\n" +
                "audio amplifier."));
        wordList.add(new Word("flash","a brief, sudden burst of bright light:\n" +
                "a flash of lightning."));
        // Magic Eight Ball
        magicEightList = new ArrayList<>();
        Random rand = new Random();
        magicEightList.add(new MagicEight("Am I going to pass school?", "Yes definitely"));
        magicEightList.add(new MagicEight("Is it worth staying in this relationship?", "My reply is no"));
        magicEightList.add(new MagicEight("Am I going on a hiking trip this year?", "Sign points to yes"));
        magicEightList.add(new MagicEight("Am I mean?", "Ask again later"));
        magicEightList.add(new MagicEight("I am smart, right?", "You know nothing"));
        magicEightList.add(new MagicEight("Am I the best cook in the world?", "Doubt it"));
        //int magic = magicEightList[rand.nextInt(magicEightList.size())];
    }
    // Route to GET list of Quotes
    @RequestMapping(value="/quotes", method = RequestMethod.GET)
    public List<Quote> getQuotes(){
        return quoteList;
    }

    // Route to GET list of Definitions
    @RequestMapping(value="/words", method = RequestMethod.GET)
    public List<Word> getWords(){
        return wordList;
    }

    // Route to POST Eight Ball answers
    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public MagicEight createMagic(@RequestBody MagicEight magicEight){
    
    }
}
