package app.sombrita;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mTrueButton;
    private Button mFalseButton;
    private Button mFalseButton1;
    private ImageButton mNextButton;
    private ImageButton mPrevButton;
    private ImageView mQuestionImageView;
    private TextView mQuestionTextView;
    private TextView mAnswerTextView;
    private TextView mAnswerTextView2;
    private TextView mAnswerTextView3;
    private TextView mCounterTextView;


    //QUESTIONS
    private TrueFalse[] mQuestionBank = new TrueFalse[] {
            new TrueFalse(R.string.question_1, true),
            new TrueFalse(R.string.question_2, true),
            new TrueFalse(R.string.question_3, false),
            new TrueFalse(R.string.question_4, false),
            new TrueFalse(R.string.question_5, true),
            new TrueFalse(R.string.question_6, true),
            new TrueFalse(R.string.question_7, false),
            new TrueFalse(R.string.question_8, false),
            new TrueFalse(R.string.question_9, true),
            new TrueFalse(R.string.question_10, true),
            new TrueFalse(R.string.question_11, true),
            new TrueFalse(R.string.question_12, true),
            new TrueFalse(R.string.question_13, false),
            new TrueFalse(R.string.question_14, false),
            new TrueFalse(R.string.question_15, true),
            new TrueFalse(R.string.question_16, false),
            new TrueFalse(R.string.question_17, false),
            new TrueFalse(R.string.question_18, true),
            new TrueFalse(R.string.question_19, false),
            new TrueFalse(R.string.question_20, false),
            new TrueFalse(R.string.question_21, false),
            new TrueFalse(R.string.question_22, false),
            new TrueFalse(R.string.question_23, true),
            new TrueFalse(R.string.question_24, true),
            new TrueFalse(R.string.question_25, true),
            new TrueFalse(R.string.question_26, true),
            new TrueFalse(R.string.question_27, true),
            new TrueFalse(R.string.question_28, false),
            new TrueFalse(R.string.question_29, false),
            new TrueFalse(R.string.question_30, false),
            new TrueFalse(R.string.question_31, false),
            new TrueFalse(R.string.question_32, true),
            new TrueFalse(R.string.question_33, false),
            new TrueFalse(R.string.question_34, false),
            new TrueFalse(R.string.question_35, true),
            new TrueFalse(R.string.question_36, true),
            new TrueFalse(R.string.question_37, false),
            new TrueFalse(R.string.question_38, false),
            new TrueFalse(R.string.question_39, true),
            new TrueFalse(R.string.question_40, true),
            new TrueFalse(R.string.question_41, true),
            new TrueFalse(R.string.question_42, true),
            new TrueFalse(R.string.question_43, false),
            new TrueFalse(R.string.question_44, false),
            new TrueFalse(R.string.question_45, true),
            new TrueFalse(R.string.question_46, false),
            new TrueFalse(R.string.question_47, false),
            new TrueFalse(R.string.question_48, true),
            new TrueFalse(R.string.question_49, false),
            new TrueFalse(R.string.question_50, false),
            new TrueFalse(R.string.question_51, true),
            new TrueFalse(R.string.question_52, false),
            new TrueFalse(R.string.question_53, true),
            new TrueFalse(R.string.question_54, false),
            new TrueFalse(R.string.question_55, false),
            new TrueFalse(R.string.question_56, true),
            new TrueFalse(R.string.question_57, true),
            new TrueFalse(R.string.question_58, true),
            new TrueFalse(R.string.question_59, false),
            new TrueFalse(R.string.question_60, false),
            new TrueFalse(R.string.question_61, false),
            new TrueFalse(R.string.question_62, true),
            new TrueFalse(R.string.question_63, false),
            new TrueFalse(R.string.question_64, false),
            new TrueFalse(R.string.question_65, false),
            new TrueFalse(R.string.question_66, true),
            new TrueFalse(R.string.question_67, false),
            new TrueFalse(R.string.question_68, false),
            new TrueFalse(R.string.question_69, true),
            new TrueFalse(R.string.question_70, true),
            new TrueFalse(R.string.question_71, true),
            new TrueFalse(R.string.question_72, true),
            new TrueFalse(R.string.question_73, false),
            new TrueFalse(R.string.question_74, false),
            new TrueFalse(R.string.question_75, true),
            new TrueFalse(R.string.question_76, false),
            new TrueFalse(R.string.question_77, true),
            new TrueFalse(R.string.question_78, true),
            new TrueFalse(R.string.question_79, true),
            new TrueFalse(R.string.question_80, false),
            new TrueFalse(R.string.question_81, true),
            new TrueFalse(R.string.question_82, false),
            new TrueFalse(R.string.question_83, true),
            new TrueFalse(R.string.question_84, true),
            new TrueFalse(R.string.question_85, false),
            new TrueFalse(R.string.question_86, true),
            new TrueFalse(R.string.question_87, false),
            new TrueFalse(R.string.question_88, false),
            new TrueFalse(R.string.question_89, false),
            new TrueFalse(R.string.question_90, false),
            new TrueFalse(R.string.question_91, false),
            new TrueFalse(R.string.question_92, true),
            new TrueFalse(R.string.question_93, false),
            new TrueFalse(R.string.question_94, false),
            new TrueFalse(R.string.question_95, true),
            new TrueFalse(R.string.question_96, true),
            new TrueFalse(R.string.question_97, false),
            new TrueFalse(R.string.question_98, false),
            new TrueFalse(R.string.question_99, true),
            new TrueFalse(R.string.question_100, true),
            new TrueFalse(R.string.question_101, true),
            new TrueFalse(R.string.question_102, true),
            new TrueFalse(R.string.question_103, false),
            new TrueFalse(R.string.question_104, false),
            new TrueFalse(R.string.question_105, true),
            new TrueFalse(R.string.question_106, false),
            new TrueFalse(R.string.question_107, false),
            new TrueFalse(R.string.question_108, true),
            new TrueFalse(R.string.question_109, false),
            new TrueFalse(R.string.question_100, false),
            new TrueFalse(R.string.question_111, true),
            new TrueFalse(R.string.question_112, false),
            new TrueFalse(R.string.question_113, true),
            new TrueFalse(R.string.question_114, false),
            new TrueFalse(R.string.question_115, false),
            new TrueFalse(R.string.question_116, true),
            new TrueFalse(R.string.question_117, true),
            new TrueFalse(R.string.question_118, true),
            new TrueFalse(R.string.question_119, false),
            new TrueFalse(R.string.question_120, false),
            new TrueFalse(R.string.question_121, false),
            new TrueFalse(R.string.question_122, false),
            new TrueFalse(R.string.question_123, false),
            new TrueFalse(R.string.question_124, false),
            new TrueFalse(R.string.question_125, false),
            new TrueFalse(R.string.question_126, false),
            new TrueFalse(R.string.question_127, false),
            new TrueFalse(R.string.question_128, false),
            new TrueFalse(R.string.question_129, false),
            new TrueFalse(R.string.question_130, false),
            new TrueFalse(R.string.question_131, false),
            new TrueFalse(R.string.question_132, false),
            new TrueFalse(R.string.question_133, false),
            new TrueFalse(R.string.question_134, false),
            new TrueFalse(R.string.question_135, false),
            new TrueFalse(R.string.question_136, false),
            new TrueFalse(R.string.question_137, false),
            new TrueFalse(R.string.question_138, false),
            new TrueFalse(R.string.question_139, false),




    };
    //ANSWER BUTTON 1
    private TrueFalse[] mAnswerBank = new TrueFalse[] {
            new TrueFalse(R.string.answer_1_option_A, true),
            new TrueFalse(R.string.answer_2_option_A, true),
            new TrueFalse(R.string.answer_3_option_A, false),
            new TrueFalse(R.string.answer_4_option_A, false),
            new TrueFalse(R.string.answer_5_option_A, true),
            new TrueFalse(R.string.answer_6_option_A, true),
            new TrueFalse(R.string.answer_7_option_A, false),
            new TrueFalse(R.string.answer_8_option_A, false),
            new TrueFalse(R.string.answer_9_option_A, true),
            new TrueFalse(R.string.answer_10_option_A, true),
            new TrueFalse(R.string.answer_11_option_A, true),
            new TrueFalse(R.string.answer_12_option_A, true),
            new TrueFalse(R.string.answer_13_option_A, false),
            new TrueFalse(R.string.answer_14_option_A, false),
            new TrueFalse(R.string.answer_15_option_A, true),
            new TrueFalse(R.string.answer_16_option_A, false),
            new TrueFalse(R.string.answer_17_option_A, false),
            new TrueFalse(R.string.answer_18_option_A, true),
            new TrueFalse(R.string.answer_19_option_A, false),
            new TrueFalse(R.string.answer_20_option_A, false),
            new TrueFalse(R.string.answer_21_option_A, false),
            new TrueFalse(R.string.answer_22_option_A, false),
            new TrueFalse(R.string.answer_23_option_A, true),
            new TrueFalse(R.string.answer_24_option_A, true),
            new TrueFalse(R.string.answer_25_option_A, true),
            new TrueFalse(R.string.answer_26_option_A, true),
            new TrueFalse(R.string.answer_27_option_A, true),
            new TrueFalse(R.string.answer_28_option_A, false),
            new TrueFalse(R.string.answer_29_option_A, false),
            new TrueFalse(R.string.answer_30_option_A, false),
            new TrueFalse(R.string.answer_31_option_A, true),
            new TrueFalse(R.string.answer_32_option_A, true),
            new TrueFalse(R.string.answer_33_option_A, false),
            new TrueFalse(R.string.answer_34_option_A, false),
            new TrueFalse(R.string.answer_35_option_A, true),
            new TrueFalse(R.string.answer_36_option_A, true),
            new TrueFalse(R.string.answer_37_option_A, false),
            new TrueFalse(R.string.answer_38_option_A, false),
            new TrueFalse(R.string.answer_39_option_A, true),
            new TrueFalse(R.string.answer_40_option_A, true),
            new TrueFalse(R.string.answer_41_option_A, true),
            new TrueFalse(R.string.answer_42_option_A, true),
            new TrueFalse(R.string.answer_43_option_A, false),
            new TrueFalse(R.string.answer_44_option_A, false),
            new TrueFalse(R.string.answer_45_option_A, true),
            new TrueFalse(R.string.answer_46_option_A, false),
            new TrueFalse(R.string.answer_47_option_A, false),
            new TrueFalse(R.string.answer_48_option_A, true),
            new TrueFalse(R.string.answer_49_option_A, false),
            new TrueFalse(R.string.answer_50_option_A, false),
            new TrueFalse(R.string.answer_51_option_A, true),
            new TrueFalse(R.string.answer_52_option_A, false),
            new TrueFalse(R.string.answer_53_option_A, true),
            new TrueFalse(R.string.answer_54_option_A, false),
            new TrueFalse(R.string.answer_55_option_A, false),
            new TrueFalse(R.string.answer_56_option_A, true),
            new TrueFalse(R.string.answer_57_option_A, true),
            new TrueFalse(R.string.answer_58_option_A, true),
            new TrueFalse(R.string.answer_59_option_A, false),
            new TrueFalse(R.string.answer_60_option_A, false),
            new TrueFalse(R.string.answer_61_option_A, false),
            new TrueFalse(R.string.answer_62_option_A, false),
            new TrueFalse(R.string.answer_63_option_A, true),
            new TrueFalse(R.string.answer_64_option_A, true),
            new TrueFalse(R.string.answer_65_option_A, false),
            new TrueFalse(R.string.answer_66_option_A, false),
            new TrueFalse(R.string.answer_67_option_A, true),
            new TrueFalse(R.string.answer_68_option_A, true),
            new TrueFalse(R.string.answer_69_option_A, true),
            new TrueFalse(R.string.answer_70_option_A, true),
            new TrueFalse(R.string.answer_71_option_A, true),
            new TrueFalse(R.string.answer_72_option_A, true),
            new TrueFalse(R.string.answer_73_option_A, true),
            new TrueFalse(R.string.answer_74_option_A, true),
            new TrueFalse(R.string.answer_75_option_A, true),
            new TrueFalse(R.string.answer_76_option_A, true),
            new TrueFalse(R.string.answer_77_option_A, true),
            new TrueFalse(R.string.answer_78_option_A, true),
            new TrueFalse(R.string.answer_79_option_A, true),
            new TrueFalse(R.string.answer_80_option_A, true),
            new TrueFalse(R.string.answer_81_option_A, true),
            new TrueFalse(R.string.answer_82_option_A, true),
            new TrueFalse(R.string.answer_83_option_A, true),
            new TrueFalse(R.string.answer_84_option_A, true),
            new TrueFalse(R.string.answer_85_option_A, false),
            new TrueFalse(R.string.answer_86_option_A, true),
            new TrueFalse(R.string.answer_87_option_A, true),
            new TrueFalse(R.string.answer_88_option_A, true),
            new TrueFalse(R.string.answer_89_option_A, true),
            new TrueFalse(R.string.answer_90_option_A, true),
            new TrueFalse(R.string.answer_91_option_A, true),
            new TrueFalse(R.string.answer_92_option_A, true),
            new TrueFalse(R.string.answer_93_option_A, true),
            new TrueFalse(R.string.answer_94_option_A, true),
            new TrueFalse(R.string.answer_95_option_A, true),
            new TrueFalse(R.string.answer_96_option_A, false),
            new TrueFalse(R.string.answer_97_option_A, true),
            new TrueFalse(R.string.answer_98_option_A, true),
            new TrueFalse(R.string.answer_99_option_A, true),
            new TrueFalse(R.string.answer_100_option_A, true),
            new TrueFalse(R.string.answer_101_option_A, true),
            new TrueFalse(R.string.answer_102_option_A, true),
            new TrueFalse(R.string.answer_103_option_A, true),
            new TrueFalse(R.string.answer_104_option_A, true),
            new TrueFalse(R.string.answer_105_option_A, true),
            new TrueFalse(R.string.answer_106_option_A, true),
            new TrueFalse(R.string.answer_107_option_A, true),
            new TrueFalse(R.string.answer_108_option_A, true),
            new TrueFalse(R.string.answer_109_option_A, true),
            new TrueFalse(R.string.answer_100_option_A, true),
            new TrueFalse(R.string.answer_111_option_A, true),
            new TrueFalse(R.string.answer_112_option_A, true),
            new TrueFalse(R.string.answer_113_option_A, true),
            new TrueFalse(R.string.answer_114_option_A, true),
            new TrueFalse(R.string.answer_115_option_A, true),
            new TrueFalse(R.string.answer_116_option_A, true),
            new TrueFalse(R.string.answer_117_option_A, true),
            new TrueFalse(R.string.answer_118_option_A, true),
            new TrueFalse(R.string.answer_119_option_A, true),
            new TrueFalse(R.string.answer_120_option_A, true),
            new TrueFalse(R.string.answer_121_option_A, true),
            new TrueFalse(R.string.answer_122_option_A, true),
            new TrueFalse(R.string.answer_123_option_A, true),
            new TrueFalse(R.string.answer_124_option_A, true),
            new TrueFalse(R.string.answer_125_option_A, true),
            new TrueFalse(R.string.answer_126_option_A, true),
            new TrueFalse(R.string.answer_127_option_A, true),
            new TrueFalse(R.string.answer_128_option_A, true),
            new TrueFalse(R.string.answer_129_option_A, true),
            new TrueFalse(R.string.answer_130_option_A, true),
            new TrueFalse(R.string.answer_131_option_A, true),
            new TrueFalse(R.string.answer_132_option_A, true),
            new TrueFalse(R.string.answer_133_option_A, true),
            new TrueFalse(R.string.answer_134_option_A, true),
            new TrueFalse(R.string.answer_135_option_A, true),
            new TrueFalse(R.string.answer_136_option_A, true),
            new TrueFalse(R.string.answer_137_option_A, true),
            new TrueFalse(R.string.answer_138_option_A, true),
            new TrueFalse(R.string.answer_139_option_A, true),
    };
    //ANSWER BUTTON 2
    private TrueFalse[] mAnswerBank2 = new TrueFalse[] {
            new TrueFalse(R.string.answer_1_option_B, false),
            new TrueFalse(R.string.answer_2_option_B, false),
            new TrueFalse(R.string.answer_3_option_B, true),
            new TrueFalse(R.string.answer_4_option_B, true),
            new TrueFalse(R.string.answer_5_option_B, false),
            new TrueFalse(R.string.answer_6_option_B, false),
            new TrueFalse(R.string.answer_7_option_B, true),
            new TrueFalse(R.string.answer_8_option_B, true),
            new TrueFalse(R.string.answer_9_option_B, true),
            new TrueFalse(R.string.answer_10_option_B, true),
            new TrueFalse(R.string.answer_11_option_B, false),
            new TrueFalse(R.string.answer_12_option_B, false),
            new TrueFalse(R.string.answer_13_option_B, false),
            new TrueFalse(R.string.answer_14_option_B, true),
            new TrueFalse(R.string.answer_15_option_B, false),
            new TrueFalse(R.string.answer_16_option_B, true),
            new TrueFalse(R.string.answer_17_option_B, true),
            new TrueFalse(R.string.answer_18_option_B, false),
            new TrueFalse(R.string.answer_19_option_B, true),
            new TrueFalse(R.string.answer_20_option_B, true),
            new TrueFalse(R.string.answer_21_option_B, true),
            new TrueFalse(R.string.answer_22_option_B, false),
            new TrueFalse(R.string.answer_23_option_B, false),
            new TrueFalse(R.string.answer_24_option_B, false),
            new TrueFalse(R.string.answer_25_option_B, true),
            new TrueFalse(R.string.answer_26_option_B, false),
            new TrueFalse(R.string.answer_27_option_B, true),
            new TrueFalse(R.string.answer_28_option_B, true),
            new TrueFalse(R.string.answer_29_option_B, false),
            new TrueFalse(R.string.answer_30_option_B, true),
            new TrueFalse(R.string.answer_31_option_B, false),
            new TrueFalse(R.string.answer_32_option_B, false),
            new TrueFalse(R.string.answer_33_option_B, true),
            new TrueFalse(R.string.answer_34_option_B, true),
            new TrueFalse(R.string.answer_35_option_B, false),
            new TrueFalse(R.string.answer_36_option_B, false),
            new TrueFalse(R.string.answer_37_option_B, true),
            new TrueFalse(R.string.answer_38_option_B, true),
            new TrueFalse(R.string.answer_39_option_B, true),
            new TrueFalse(R.string.answer_40_option_B, true),
            new TrueFalse(R.string.answer_41_option_B, false),
            new TrueFalse(R.string.answer_42_option_B, false),
            new TrueFalse(R.string.answer_43_option_B, false),
            new TrueFalse(R.string.answer_44_option_B, true),
            new TrueFalse(R.string.answer_45_option_B, false),
            new TrueFalse(R.string.answer_46_option_B, true),
            new TrueFalse(R.string.answer_47_option_B, true),
            new TrueFalse(R.string.answer_48_option_B, false),
            new TrueFalse(R.string.answer_49_option_B, true),
            new TrueFalse(R.string.answer_50_option_B, true),
            new TrueFalse(R.string.answer_51_option_B, true),
            new TrueFalse(R.string.answer_52_option_B, false),
            new TrueFalse(R.string.answer_53_option_B, false),
            new TrueFalse(R.string.answer_54_option_B, false),
            new TrueFalse(R.string.answer_55_option_B, true),
            new TrueFalse(R.string.answer_56_option_B, false),
            new TrueFalse(R.string.answer_57_option_B, true),
            new TrueFalse(R.string.answer_58_option_B, true),
            new TrueFalse(R.string.answer_59_option_B, false),
            new TrueFalse(R.string.answer_60_option_B, true),
            new TrueFalse(R.string.answer_61_option_B, true),
            new TrueFalse(R.string.answer_62_option_B, true),
            new TrueFalse(R.string.answer_63_option_B, true),
            new TrueFalse(R.string.answer_64_option_B, true),
            new TrueFalse(R.string.answer_65_option_B, true),
            new TrueFalse(R.string.answer_66_option_B, false),
            new TrueFalse(R.string.answer_67_option_B, true),
            new TrueFalse(R.string.answer_68_option_B, true),
            new TrueFalse(R.string.answer_69_option_B, true),
            new TrueFalse(R.string.answer_70_option_B, true),
            new TrueFalse(R.string.answer_71_option_B, true),
            new TrueFalse(R.string.answer_72_option_B, true),
            new TrueFalse(R.string.answer_73_option_B, true),
            new TrueFalse(R.string.answer_74_option_B, true),
            new TrueFalse(R.string.answer_75_option_B, true),
            new TrueFalse(R.string.answer_76_option_B, true),
            new TrueFalse(R.string.answer_77_option_B, true),
            new TrueFalse(R.string.answer_78_option_B, true),
            new TrueFalse(R.string.answer_79_option_B, true),
            new TrueFalse(R.string.answer_80_option_B, true),
            new TrueFalse(R.string.answer_81_option_B, true),
            new TrueFalse(R.string.answer_82_option_B, true),
            new TrueFalse(R.string.answer_83_option_B, true),
            new TrueFalse(R.string.answer_84_option_B, true),
            new TrueFalse(R.string.answer_85_option_B, true),
            new TrueFalse(R.string.answer_86_option_B, true),
            new TrueFalse(R.string.answer_87_option_B, true),
            new TrueFalse(R.string.answer_88_option_B, true),
            new TrueFalse(R.string.answer_89_option_B, true),
            new TrueFalse(R.string.answer_90_option_B, true),
            new TrueFalse(R.string.answer_91_option_B, true),
            new TrueFalse(R.string.answer_92_option_B, true),
            new TrueFalse(R.string.answer_93_option_B, true),
            new TrueFalse(R.string.answer_94_option_B, true),
            new TrueFalse(R.string.answer_95_option_B, true),
            new TrueFalse(R.string.answer_96_option_B, false),
            new TrueFalse(R.string.answer_97_option_B, true),
            new TrueFalse(R.string.answer_98_option_B, true),
            new TrueFalse(R.string.answer_99_option_B, true),
            new TrueFalse(R.string.answer_100_option_B, true),
            new TrueFalse(R.string.answer_101_option_B, true),
            new TrueFalse(R.string.answer_102_option_B, true),
            new TrueFalse(R.string.answer_103_option_B, true),
            new TrueFalse(R.string.answer_104_option_B, true),
            new TrueFalse(R.string.answer_105_option_B, true),
            new TrueFalse(R.string.answer_106_option_B, true),
            new TrueFalse(R.string.answer_107_option_B, true),
            new TrueFalse(R.string.answer_108_option_B, true),
            new TrueFalse(R.string.answer_109_option_B, true),
            new TrueFalse(R.string.answer_100_option_B, true),
            new TrueFalse(R.string.answer_111_option_B, true),
            new TrueFalse(R.string.answer_112_option_B, true),
            new TrueFalse(R.string.answer_113_option_B, true),
            new TrueFalse(R.string.answer_114_option_B, true),
            new TrueFalse(R.string.answer_115_option_B, true),
            new TrueFalse(R.string.answer_116_option_B, true),
            new TrueFalse(R.string.answer_117_option_B, true),
            new TrueFalse(R.string.answer_118_option_B, true),
            new TrueFalse(R.string.answer_119_option_B, true),
            new TrueFalse(R.string.answer_120_option_B, true),
            new TrueFalse(R.string.answer_121_option_B, true),
            new TrueFalse(R.string.answer_122_option_B, true),
            new TrueFalse(R.string.answer_123_option_B, true),
            new TrueFalse(R.string.answer_124_option_B, true),
            new TrueFalse(R.string.answer_125_option_B, true),
            new TrueFalse(R.string.answer_126_option_B, true),
            new TrueFalse(R.string.answer_127_option_B, true),
            new TrueFalse(R.string.answer_128_option_B, true),
            new TrueFalse(R.string.answer_129_option_B, true),
            new TrueFalse(R.string.answer_130_option_B, true),
            new TrueFalse(R.string.answer_131_option_B, true),
            new TrueFalse(R.string.answer_132_option_B, true),
            new TrueFalse(R.string.answer_133_option_B, true),
            new TrueFalse(R.string.answer_134_option_B, true),
            new TrueFalse(R.string.answer_135_option_B, true),
            new TrueFalse(R.string.answer_136_option_B, true),
            new TrueFalse(R.string.answer_137_option_B, true),
            new TrueFalse(R.string.answer_138_option_B, true),
            new TrueFalse(R.string.answer_139_option_B, true),

    };
    //ANSWER BUTTON 3
    private TrueFalse[] mAnswerBank3 = new TrueFalse[] {
            new TrueFalse(R.string.answer_1_option_C, true),
            new TrueFalse(R.string.answer_2_option_C, true),
            new TrueFalse(R.string.answer_3_option_C, true),
            new TrueFalse(R.string.answer_4_option_C, true),
            new TrueFalse(R.string.answer_5_option_C, true),
            new TrueFalse(R.string.answer_6_option_C, false),
            new TrueFalse(R.string.answer_7_option_C, true),
            new TrueFalse(R.string.answer_8_option_C, true),
            new TrueFalse(R.string.answer_9_option_C, true),
            new TrueFalse(R.string.answer_10_option_C, true),
            new TrueFalse(R.string.answer_11_option_C, true),
            new TrueFalse(R.string.answer_12_option_C, true),
            new TrueFalse(R.string.answer_13_option_C, true),
            new TrueFalse(R.string.answer_14_option_C, true),
            new TrueFalse(R.string.answer_15_option_C, true),
            new TrueFalse(R.string.answer_16_option_C, true),
            new TrueFalse(R.string.answer_17_option_C, true),
            new TrueFalse(R.string.answer_18_option_C, true),
            new TrueFalse(R.string.answer_19_option_C, true),
            new TrueFalse(R.string.answer_20_option_C, true),
            new TrueFalse(R.string.answer_21_option_C, true),
            new TrueFalse(R.string.answer_22_option_C, true),
            new TrueFalse(R.string.answer_23_option_C, true),
            new TrueFalse(R.string.answer_24_option_C, true),
            new TrueFalse(R.string.answer_25_option_C, true),
            new TrueFalse(R.string.answer_26_option_C, true),
            new TrueFalse(R.string.answer_27_option_C, true),
            new TrueFalse(R.string.answer_28_option_C, true),
            new TrueFalse(R.string.answer_29_option_C, true),
            new TrueFalse(R.string.answer_30_option_C, true),
            new TrueFalse(R.string.answer_31_option_C, true),
            new TrueFalse(R.string.answer_32_option_C, true),
            new TrueFalse(R.string.answer_33_option_C, true),
            new TrueFalse(R.string.answer_34_option_C, true),
            new TrueFalse(R.string.answer_35_option_C, true),
            new TrueFalse(R.string.answer_36_option_C, false),
            new TrueFalse(R.string.answer_37_option_C, true),
            new TrueFalse(R.string.answer_38_option_C, true),
            new TrueFalse(R.string.answer_39_option_C, true),
            new TrueFalse(R.string.answer_40_option_C, true),
            new TrueFalse(R.string.answer_41_option_C, true),
            new TrueFalse(R.string.answer_42_option_C, true),
            new TrueFalse(R.string.answer_43_option_C, true),
            new TrueFalse(R.string.answer_44_option_C, true),
            new TrueFalse(R.string.answer_45_option_C, true),
            new TrueFalse(R.string.answer_46_option_C, true),
            new TrueFalse(R.string.answer_47_option_C, true),
            new TrueFalse(R.string.answer_48_option_C, true),
            new TrueFalse(R.string.answer_49_option_C, true),
            new TrueFalse(R.string.answer_50_option_C, true),
            new TrueFalse(R.string.answer_51_option_C, true),
            new TrueFalse(R.string.answer_52_option_C, true),
            new TrueFalse(R.string.answer_53_option_C, true),
            new TrueFalse(R.string.answer_54_option_C, true),
            new TrueFalse(R.string.answer_55_option_C, true),
            new TrueFalse(R.string.answer_56_option_C, true),
            new TrueFalse(R.string.answer_57_option_C, true),
            new TrueFalse(R.string.answer_58_option_C, true),
            new TrueFalse(R.string.answer_59_option_C, true),
            new TrueFalse(R.string.answer_60_option_C, true),
            new TrueFalse(R.string.answer_61_option_C, true),
            new TrueFalse(R.string.answer_62_option_C, false),
            new TrueFalse(R.string.answer_63_option_C, true),
            new TrueFalse(R.string.answer_64_option_C, true),
            new TrueFalse(R.string.answer_65_option_C, false),
            new TrueFalse(R.string.answer_66_option_C, false),
            new TrueFalse(R.string.answer_67_option_C, true),
            new TrueFalse(R.string.answer_68_option_C, true),
            new TrueFalse(R.string.answer_69_option_C, true),
            new TrueFalse(R.string.answer_70_option_C, true),
            new TrueFalse(R.string.answer_71_option_C, true),
            new TrueFalse(R.string.answer_72_option_C, true),
            new TrueFalse(R.string.answer_73_option_C, true),
            new TrueFalse(R.string.answer_74_option_C, true),
            new TrueFalse(R.string.answer_75_option_C, true),
            new TrueFalse(R.string.answer_76_option_C, true),
            new TrueFalse(R.string.answer_77_option_C, true),
            new TrueFalse(R.string.answer_78_option_C, true),
            new TrueFalse(R.string.answer_79_option_C, true),
            new TrueFalse(R.string.answer_80_option_C, true),
            new TrueFalse(R.string.answer_81_option_C, true),
            new TrueFalse(R.string.answer_82_option_C, true),
            new TrueFalse(R.string.answer_83_option_C, true),
            new TrueFalse(R.string.answer_84_option_C, true),
            new TrueFalse(R.string.answer_85_option_C, true),
            new TrueFalse(R.string.answer_86_option_C, true),
            new TrueFalse(R.string.answer_87_option_C, true),
            new TrueFalse(R.string.answer_88_option_C, true),
            new TrueFalse(R.string.answer_89_option_C, true),
            new TrueFalse(R.string.answer_90_option_C, true),
            new TrueFalse(R.string.answer_91_option_C, true),
            new TrueFalse(R.string.answer_92_option_C, true),
            new TrueFalse(R.string.answer_93_option_C, true),
            new TrueFalse(R.string.answer_94_option_C, true),
            new TrueFalse(R.string.answer_95_option_C, true),
            new TrueFalse(R.string.answer_96_option_C, false),
            new TrueFalse(R.string.answer_97_option_C, true),
            new TrueFalse(R.string.answer_98_option_C, true),
            new TrueFalse(R.string.answer_99_option_C, true),
            new TrueFalse(R.string.answer_100_option_C, true),
            new TrueFalse(R.string.answer_101_option_C, true),
            new TrueFalse(R.string.answer_102_option_C, true),
            new TrueFalse(R.string.answer_103_option_C, true),
            new TrueFalse(R.string.answer_104_option_C, true),
            new TrueFalse(R.string.answer_105_option_C, true),
            new TrueFalse(R.string.answer_106_option_C, true),
            new TrueFalse(R.string.answer_107_option_C, true),
            new TrueFalse(R.string.answer_108_option_C, true),
            new TrueFalse(R.string.answer_109_option_C, true),
            new TrueFalse(R.string.answer_100_option_C, true),
            new TrueFalse(R.string.answer_111_option_C, true),
            new TrueFalse(R.string.answer_112_option_C, true),
            new TrueFalse(R.string.answer_113_option_C, true),
            new TrueFalse(R.string.answer_114_option_C, true),
            new TrueFalse(R.string.answer_115_option_C, true),
            new TrueFalse(R.string.answer_116_option_C, true),
            new TrueFalse(R.string.answer_117_option_C, true),
            new TrueFalse(R.string.answer_118_option_C, true),
            new TrueFalse(R.string.answer_119_option_C, true),
            new TrueFalse(R.string.answer_120_option_C, true),
            new TrueFalse(R.string.answer_121_option_C, true),
            new TrueFalse(R.string.answer_122_option_C, true),
            new TrueFalse(R.string.answer_123_option_C, true),
            new TrueFalse(R.string.answer_124_option_C, true),
            new TrueFalse(R.string.answer_125_option_C, true),
            new TrueFalse(R.string.answer_126_option_C, true),
            new TrueFalse(R.string.answer_127_option_C, true),
            new TrueFalse(R.string.answer_128_option_C, true),
            new TrueFalse(R.string.answer_129_option_C, true),
            new TrueFalse(R.string.answer_130_option_C, true),
            new TrueFalse(R.string.answer_131_option_C, true),
            new TrueFalse(R.string.answer_132_option_C, true),
            new TrueFalse(R.string.answer_133_option_C, true),
            new TrueFalse(R.string.answer_134_option_C, true),
            new TrueFalse(R.string.answer_135_option_C, true),
            new TrueFalse(R.string.answer_136_option_C, true),
            new TrueFalse(R.string.answer_137_option_C, true),
            new TrueFalse(R.string.answer_138_option_C, true),
            new TrueFalse(R.string.answer_139_option_C, true),

    };

    //COUNTER QUESTION
    private TrueFalse[] mCounterBank = new TrueFalse[] {
            new TrueFalse(R.string.counter_1, true),
            new TrueFalse(R.string.counter_2, true),
            new TrueFalse(R.string.counter_3, true),
            new TrueFalse(R.string.counter_4, true),
            new TrueFalse(R.string.counter_5, true),
            new TrueFalse(R.string.counter_6, true),
            new TrueFalse(R.string.counter_7, true),
            new TrueFalse(R.string.counter_8, true),
            new TrueFalse(R.string.counter_9, true),
            new TrueFalse(R.string.counter_10, true),
            new TrueFalse(R.string.counter_11, true),
            new TrueFalse(R.string.counter_12, true),
            new TrueFalse(R.string.counter_13, true),
            new TrueFalse(R.string.counter_14, true),
            new TrueFalse(R.string.counter_15, true),
            new TrueFalse(R.string.counter_16, true),
            new TrueFalse(R.string.counter_17, true),
            new TrueFalse(R.string.counter_18, true),
            new TrueFalse(R.string.counter_19, true),
            new TrueFalse(R.string.counter_20, true),
            new TrueFalse(R.string.counter_21, true),
            new TrueFalse(R.string.counter_22, true),
            new TrueFalse(R.string.counter_23, true),
            new TrueFalse(R.string.counter_24, true),
            new TrueFalse(R.string.counter_25, true),
            new TrueFalse(R.string.counter_26, true),
            new TrueFalse(R.string.counter_27, true),
            new TrueFalse(R.string.counter_28, true),
            new TrueFalse(R.string.counter_29, true),
            new TrueFalse(R.string.counter_30, true),
            new TrueFalse(R.string.counter_31, true),
            new TrueFalse(R.string.counter_32, true),
            new TrueFalse(R.string.counter_33, true),
            new TrueFalse(R.string.counter_34, true),
            new TrueFalse(R.string.counter_35, true),
            new TrueFalse(R.string.counter_36, true),
            new TrueFalse(R.string.counter_37, true),
            new TrueFalse(R.string.counter_38, true),
            new TrueFalse(R.string.counter_39, true),
            new TrueFalse(R.string.counter_40, true),
            new TrueFalse(R.string.counter_41, true),
            new TrueFalse(R.string.counter_42, true),
            new TrueFalse(R.string.counter_43, true),
            new TrueFalse(R.string.counter_44, true),
            new TrueFalse(R.string.counter_45, true),
            new TrueFalse(R.string.counter_46, true),
            new TrueFalse(R.string.counter_47, true),
            new TrueFalse(R.string.counter_48, true),
            new TrueFalse(R.string.counter_49, true),
            new TrueFalse(R.string.counter_50, true),
            new TrueFalse(R.string.counter_51, true),
            new TrueFalse(R.string.counter_52, true),
            new TrueFalse(R.string.counter_53, true),
            new TrueFalse(R.string.counter_54, true),
            new TrueFalse(R.string.counter_55, true),
            new TrueFalse(R.string.counter_56, true),
            new TrueFalse(R.string.counter_57, true),
            new TrueFalse(R.string.counter_58, true),
            new TrueFalse(R.string.counter_59, true),
            new TrueFalse(R.string.counter_60, true),
            new TrueFalse(R.string.counter_61, true),
            new TrueFalse(R.string.counter_62, true),
            new TrueFalse(R.string.counter_63, true),
            new TrueFalse(R.string.counter_64, true),
            new TrueFalse(R.string.counter_65, true),
            new TrueFalse(R.string.counter_66, true),
            new TrueFalse(R.string.counter_67, true),
            new TrueFalse(R.string.counter_68, true),
            new TrueFalse(R.string.counter_69, true),
            new TrueFalse(R.string.counter_70, true),
            new TrueFalse(R.string.counter_71, true),
            new TrueFalse(R.string.counter_72, true),
            new TrueFalse(R.string.counter_73, true),
            new TrueFalse(R.string.counter_74, true),
            new TrueFalse(R.string.counter_75, true),
            new TrueFalse(R.string.counter_76, true),
            new TrueFalse(R.string.counter_77, true),
            new TrueFalse(R.string.counter_78, true),
            new TrueFalse(R.string.counter_79, true),
            new TrueFalse(R.string.counter_80, true),
            new TrueFalse(R.string.counter_81, true),
            new TrueFalse(R.string.counter_82, true),
            new TrueFalse(R.string.counter_83, true),
            new TrueFalse(R.string.counter_84, true),
            new TrueFalse(R.string.counter_85, true),
            new TrueFalse(R.string.counter_86, true),
            new TrueFalse(R.string.counter_87, true),
            new TrueFalse(R.string.counter_88, true),
            new TrueFalse(R.string.counter_89, true),
            new TrueFalse(R.string.counter_90, true),
            new TrueFalse(R.string.counter_91, true),
            new TrueFalse(R.string.counter_92, true),
            new TrueFalse(R.string.counter_93, true),
            new TrueFalse(R.string.counter_94, true),
            new TrueFalse(R.string.counter_95, true),
            new TrueFalse(R.string.counter_96, true),
            new TrueFalse(R.string.counter_97, true),
            new TrueFalse(R.string.counter_98, true),
            new TrueFalse(R.string.counter_99, true),
            new TrueFalse(R.string.counter_100, true),
            new TrueFalse(R.string.counter_101, true),
            new TrueFalse(R.string.counter_102, true),
            new TrueFalse(R.string.counter_103, true),
            new TrueFalse(R.string.counter_104, true),
            new TrueFalse(R.string.counter_105, true),
            new TrueFalse(R.string.counter_106, true),
            new TrueFalse(R.string.counter_107, true),
            new TrueFalse(R.string.counter_108, true),
            new TrueFalse(R.string.counter_109, true),
            new TrueFalse(R.string.counter_110, true),
            new TrueFalse(R.string.counter_111, true),
            new TrueFalse(R.string.counter_112, true),
            new TrueFalse(R.string.counter_113, true),
            new TrueFalse(R.string.counter_114, true),
            new TrueFalse(R.string.counter_115, true),
            new TrueFalse(R.string.counter_116, true),
            new TrueFalse(R.string.counter_117, true),
            new TrueFalse(R.string.counter_118, true),
            new TrueFalse(R.string.counter_119, true),
            new TrueFalse(R.string.counter_120, true),
            new TrueFalse(R.string.counter_121, true),
            new TrueFalse(R.string.counter_122, true),
            new TrueFalse(R.string.counter_123, true),
            new TrueFalse(R.string.counter_124, true),
            new TrueFalse(R.string.counter_125, true),
            new TrueFalse(R.string.counter_126, true),
            new TrueFalse(R.string.counter_127, true),
            new TrueFalse(R.string.counter_128, true),
            new TrueFalse(R.string.counter_129, true),
            new TrueFalse(R.string.counter_130, true),
            new TrueFalse(R.string.counter_131, true),
            new TrueFalse(R.string.counter_132, true),
            new TrueFalse(R.string.counter_133, true),
            new TrueFalse(R.string.counter_134, true),
            new TrueFalse(R.string.counter_135, true),
            new TrueFalse(R.string.counter_136, true),
            new TrueFalse(R.string.counter_137, true),
            new TrueFalse(R.string.counter_138, true),
            new TrueFalse(R.string.counter_139, true),

    };

    private int mCurrentIndex = 0;

    private void updateQuestion(){
        int question = mQuestionBank[mCurrentIndex].getQuestion();
        mQuestionTextView.setText(question);
        /*int imagequestion = mQuestionBank[mCurrentIndex].getQuestion();
        mQuestionImageView.setImageResource(R.drawable.viento);*/
        int answer = mAnswerBank[mCurrentIndex].getQuestion();
        mAnswerTextView.setText(answer);
        int answer2 = mAnswerBank2[mCurrentIndex].getQuestion();
        mAnswerTextView2.setText(answer2);
        int answer3 = mAnswerBank3[mCurrentIndex].getQuestion();
        mAnswerTextView3.setText(answer3);
        int counter = mCounterBank[mCurrentIndex].getQuestion();
        mCounterTextView.setText(counter);
    }

    private void checkAnswer (boolean userPressedTrue) {
        boolean answerisTrue = mQuestionBank[mCurrentIndex].ismTrueQuestion() && mAnswerBank[mCurrentIndex].ismTrueQuestion();
        int messageResId = 0;

        if (userPressedTrue == answerisTrue) {
            messageResId = R.string.correct_toast;

        } else {
            messageResId = R.string.incorrect_toast;
        }

        Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show();

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 120, 200);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     /*   Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Ver que carajos pongo acá", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        mAnswerTextView = (Button)findViewById(R.id.true_button);
        mQuestionTextView = (TextView)findViewById(R.id.question_text_view);
        mQuestionImageView = (ImageView)findViewById(R.id.imageView);
        mCounterTextView = (TextView)findViewById(R.id.counter_text_view);
        mTrueButton = (Button)findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                checkAnswer(true);
            }
        });
        //ANSWER BUTTON 2
        mFalseButton = (Button)findViewById(R.id.false_button1);
        mAnswerTextView2 = (Button)findViewById(R.id.false_button1);
        mFalseButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                checkAnswer(false);
            }
        });


        //ANSWER BUTTON 3
        mFalseButton1 = (Button)findViewById(R.id.false_button2);
        mAnswerTextView3 = (Button)findViewById(R.id.false_button2);
        mFalseButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER_VERTICAL, 120, 200);

                //mPrevButton.setVisibility(View.VISIBLE);



            }
        });

        mNextButton = (ImageButton)findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v){
                mCurrentIndex = (mCurrentIndex + 1) %mQuestionBank.length;
                updateQuestion();

            }
        });

        mPrevButton = (ImageButton)findViewById(R.id.prev_button);
        mPrevButton.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public  void onClick(View v){
                                               mCurrentIndex = (mCurrentIndex - 1) %mQuestionBank.length;
                                               updateQuestion();

                                               if (getText(R.string.counter_1).equals("x")){
                                                   //if (getText(R.string.counter_1) == ("x")){
                                                   mPrevButton.setVisibility(View.INVISIBLE);
                                               } else {
                                                   mPrevButton.setVisibility(View.VISIBLE);
                                               }

                                           }

                                       }
        );
    }


    }


