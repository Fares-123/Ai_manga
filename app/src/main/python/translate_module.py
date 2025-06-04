import argostranslate.package
import argostranslate.translate

def translate_text(text, from_lang='ja', to_lang='ar'):
    installed_languages = argostranslate.translate.get_installed_languages()
    from_lang_obj = next(filter(lambda x: x.code == from_lang, installed_languages))
    to_lang_obj = next(filter(lambda x: x.code == to_lang, installed_languages))
    translation = from_lang_obj.get_translation(to_lang_obj)
    translated_text = translation.translate(text)
    return translated_text
